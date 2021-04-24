package com.yiyue.personalblog.service.user.impl;

import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.controller.user.UserController;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.user.domain.Role;
import com.yiyue.personalblog.entity.user.domain.RolePermission;
import com.yiyue.personalblog.entity.user.domain.UserInfo;
import com.yiyue.personalblog.entity.user.domain.UserRole;
import com.yiyue.personalblog.entity.user.example.RoleExample;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import com.yiyue.personalblog.entity.user.example.UserRoleExample;
import com.yiyue.personalblog.mapper.user.RoleMapper;
import com.yiyue.personalblog.mapper.user.RolePermissionMapper;
import com.yiyue.personalblog.mapper.user.UserInfoMapper;
import com.yiyue.personalblog.mapper.user.UserRoleMapper;
import com.yiyue.personalblog.service.user.UserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserInfoServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 23:07
 * @Modified By
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


    private Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RolePermissionMapper rolePermissionMapper;


    @Override
    public UserInfo findByName(UserInfo userInfo) {
        //根据用户名查询用户信息
        UserInfo user = userInfoMapper.findByName(userInfo);
        //根据User的id进行查询关联表User_Role
        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = userRoles.get(0);
        //声明Role的Example类
        RoleExample roleExample = new RoleExample();
        //创建Criteria动态对象
        RoleExample.Criteria roleCriteria = roleExample.createCriteria();
        if(user!=null){
            //将要查询的RoleId放入对象进行查询
            roleCriteria.andRoleIdEqualTo(userRole.getRoleId());
//            criteria.andRoleNameEqualTo(user.getUserNickName());
            //查询所有的角色保存在List中方便进行认证并查看权限功能
            List<Role> role = roleMapper.selectByExample(roleExample);
            //添加角色集合
            user.setRoleList(role);
        }
        return user;
    }


    /**
     * 用户登陆操作
     * */
    @Override
    public JsonData login(UserInfo userInfo) {
        Subject subject = SecurityUtils.getSubject();
        //如果等成功则返回一个信息到前端去
        Map<String,Object> map = new HashMap<>();
        //如果登录正常登录成功则不会发生异常 否则登录失败！
        try {
            /**
             * 查询当前登陆用户是否被禁止登陆  F：禁止  C：可用
             * */

            UserInfo user = findByName(userInfo);
            /**
             * C状态代表当前账户是可用状态
             * 我们这里使用Shiro自带UsernamePasswordToken进行一个用户登陆认证授权操作。
             * */
            if(user.getSpareone().equals("C")){
                UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userInfo.getUserLoginName(),userInfo.getUserPassword());
                //进行登录
                subject.login(usernamePasswordToken);
                //没有报错代表登陆成功  这里我们将登陆数据塞到map里面统一返回
                map.put(Constants.MSG,Constants.MSG_SUCCESS);
                //保存一个SESSION到map里面 一并返回给前端进行显示 操作等。
                map.put(Constants.SESSION,subject.getSession().getId());
                //用户UserId
                map.put("userId",user.getId());
                //用户头像
                map.put("userImage",user.getUserHeadPortrait());
                //用户名称
                map.put("userNickName",user.getUserNickName());
                //另外需要保存一个到请求里面进行过滤
                //request.getSession().setAttribute(Constants.TOKEN,subject.getSession().getId());

                /**
                 * 并且可以获得角色信息
                 * */
                List<Role> roleList = user.getRoleList();
                if(roleList.size() != 0){
                    map.put("roleName",roleList.get(0).getRoleName());
                    map.put("roleId",roleList.get(0).getRoleId());
                    map.put("roleDescription",roleList.get(0).getRoleDescription());
                }else{
                    map.put("roleName",Constants.PTUSER);
                    map.put("roleId",Constants.PTUSER);
                    map.put("roleDescription",roleList.get(0).getRoleDescription());
                }
                //将用户数据返回给前段并显示登陆成功
                return JsonData.buildSuccess(map,Constants.NUM_SCUESS);
            }
            /**
             * F代表禁用状态
             * */
            else if(user.getSpareone().equals("F")){
                return JsonData.buildSuccess(Constants.MSG_DISABLE,Constants.NUM_DISABLE);
                /**
                 * C代表正常状态 登陆就可以直接跳转到index首页界面
                 * */
            }else{
                return JsonData.buildError(Constants.MSG_USERPASSWORDERROR,Constants.NUM_ERROR);
            }
        }catch (Exception e){ //上面已经返回了 用户禁用 用户登录成功 所以发生异常的时候 最大几率为密码错误。
            /**
             * 发生异常的时候 打印出来 方便之后部署在服务器上面的时候  进行快速找到错误所在。
             * */
            logger.error(e.getMessage(),e);
            return JsonData.buildError(Constants.MSG_USERPASSWORDERROR,Constants.NUM_ERROR);
        }
    }


    /**
     * 用于对用户进行注册操作
     * 从当前模块注册用户全部处理为普通用户
     * 这里我们需要使用事务 如果其中一条Sql报错则回滚数据
     * */
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public JsonData userRegister(UserInfo userInfo) {
        try {
            Integer resCode = userInfoMapper.insertSelective(userInfo);
            if(resCode > 0){
                /**
                 * 对当前用户进行初始化角色
                 * */
                UserRole userRole = new UserRole();
                userRole.setUserId(userInfo.getId());
                userRole.setRoleId(2);//这里固定每个用户为普通用户
                if(userRoleMapper.insertSelective(userRole) > 0){
                    /**
                     * 对当前用户进行权限初始化
                     * */
                    RolePermission rolePermission = new RolePermission();
                    rolePermission.setRoleId(userRole.getRoleId());
                    rolePermission.setPermissionId(2);
                    if(rolePermissionMapper.insertSelective(rolePermission) > 0){
                        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
                    }
                }
            }
        }catch (Exception e){
            logger.info(""+e.getMessage()+"");
            return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
        }
        return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
    }

    /**
     *  查询数据库中是否已存在当前注册用户名
     * */
    @Override
    public JsonData userNickNameRegister(UserInfo userInfo) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUserLoginNameEqualTo(userInfo.getUserLoginName());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        //查询如果为空则List为0
        if(userInfos.size() > 0){
            return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
        }
        return JsonData.buildError(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
    }

    /**
     * 用户修改时查询对应的信息反显填充文本框
     * */
    @Override
    public JsonData selectUserByUserId(UserInfo userInfo) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andIdEqualTo(userInfo.getId());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        //查询如果为空则List为0
        if(userInfos.size() > 0){
            userInfos.get(0).setUserPassword("");
            return JsonData.buildSuccess(userInfos.get(0),Constants.NUM_SCUESS);
        }
        return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
    }

    /**
     * 用户修改头像或修改信息。
     * @param file
     * @param userInfo
     * */
    @Override
    public JsonData updateUserSelect(MultipartFile file, UserInfo userInfo) {
        Map<String,String> map = new HashMap<>();
        String path = "";
        try {
            if (null == file || file.isEmpty()) {
                if(userInfo != null){
                    if(userInfoMapper.updateByPrimaryKeySelective(userInfo) > 0 ){
                        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
                    }else{
                        return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
                    }
                }else{
                    return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
                }
            }else{
                String contentType = file.getContentType();
                if(!contentType.contains("image")){
                    return JsonData.buildError(Constants.MSG_IMAGE_FALSE,Constants.NUM_COMMON_ERROR);
                }
                String fileName = file.getOriginalFilename();
                System.out.println("这是文件名:"+fileName);
                String filepath = "D:/root/blog/userImage/"+userInfo.getUserLoginName()+"";//以自动生成的人才编号进行生成一个文件夹和文件夹里面的图片
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n"+filepath+"\n\n\n\n\n\n\n\n\n\n\n\n\n");
                File localFile = new File(filepath);
                if(!localFile .exists()) {
                    localFile.mkdirs();
                }
                path =filepath+"/"+fileName;
                logger.info("这是文件路径:"+path);
                File server_file = new File(path);
                file.transferTo(server_file);
                if(userInfo != null){
                    userInfo.setUserHeadPortrait(path);
                    if(userInfoMapper.updateByPrimaryKeySelective(userInfo) > 0 ){
                        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
                    }
                }else{
                    return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
                }
            }
        } catch (Exception e) {
            logger.info("文件上传异常"+e.getMessage(),e);
        }
        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
    }
}
