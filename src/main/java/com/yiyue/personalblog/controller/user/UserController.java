package com.yiyue.personalblog.controller.user;

import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.user.domain.Role;
import com.yiyue.personalblog.entity.user.domain.RolePermission;
import com.yiyue.personalblog.entity.user.domain.UserInfo;
import com.yiyue.personalblog.entity.user.domain.UserRole;
import com.yiyue.personalblog.entity.user.example.RoleExample;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import com.yiyue.personalblog.entity.user.example.UserRoleExample;
import com.yiyue.personalblog.service.user.RolePermissionService;
import com.yiyue.personalblog.service.user.UserInfoService;
import com.yiyue.personalblog.service.user.UserRoleService;
import com.yiyue.personalblog.utils.common.GetHeaders;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @ClassName: UserController
 * @Author:TanLongYue
 * @Description 功能点：
 *                      登陆（userLogin）（login）、注册（userRegister）、权限校验（notpermis）
 *                      查已存在用户名（userNickNameRegister）
 * @Date Created in 2020/10/19 19:33
 * @Modified By
 */
@RestController
@Slf4j
@RequestMapping("/pub")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private SessionDAO sessionDAO;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RolePermissionService rolePermissionService;

    /**
     * 如果用户没有权限访问一个api接口的是
     * 会进行提示没有权限 返回至前端
     * */
    //测试用户没有权限的时候 是否调用进行访问
    @RequestMapping("not_permis")
    public JsonData notpermis(){
        return JsonData.buildError(Constants.MSG_PERMISSION,Constants.NUM_PERMISSION);
    }


    /**
     * 如果用户未登录的时候就会进行调用这个方法进行返回回去.
     * 提示用户未登录
     * */
    @RequestMapping("need_login")
    public JsonData login(){
        return JsonData.buildSuccess(Constants.MSG_NOTLOGIN,Constants.NUM_NOTLOGIN);
    }

    /**
     * login用户登陆
     * 用户进行 登陆的时候的api接口
     * */
    @RequestMapping("userLogin")
    public JsonData userLogin(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response){

        Subject subject = SecurityUtils.getSubject();
        //如果等成功则返回一个信息到前端去
        Map<String,Object> map = new HashMap<>();
        //如果登录正常登录成功则不会发生异常 否则登录失败！
        try {
            /**
             * 查询当前登陆用户是否被禁止登陆  F：禁止  C：可用
             * */
       
            UserInfo user = userInfoService.findByName(userInfo);
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
                request.getSession().setAttribute(Constants.TOKEN,subject.getSession().getId());

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
    @RequestMapping("/register")
    @Transactional(rollbackFor = {Exception.class})
    public JsonData userRegister(UserInfo userInfo){
        try {
            Integer resCode = userInfoService.insertSelective(userInfo);
            if(resCode > 0){
                /**
                 * 对当前用户进行初始化角色
                 * */
                UserRole userRole = new UserRole();
                userRole.setUserId(userInfo.getId());
                userRole.setRoleId(2);//这里固定每个用户为普通用户
                if(userRoleService.insertSelective(userRole) > 0){
                    /**
                     * 对当前用户进行权限初始化
                     * */
                    RolePermission rolePermission = new RolePermission();
                    rolePermission.setRoleId(userRole.getRoleId());
                    rolePermission.setPermissionId(2);
                    if(rolePermissionService.insertSelective(rolePermission) > 0){
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
    @RequestMapping("/userNickNameRegister")
    public JsonData userNickNameRegister(UserInfo userInfo){
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUserLoginNameEqualTo(userInfo.getUserLoginName());
        List<UserInfo> userInfos = userInfoService.selectByExample(userInfoExample);
        //查询如果为空则List为0
        if(userInfos.size() > 0){
            return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
        }
        return JsonData.buildError(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
    }

}
