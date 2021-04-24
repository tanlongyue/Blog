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
    @RequestMapping(method = RequestMethod.POST,value = "userLogin")
    public JsonData userLogin(UserInfo userInfo){
        return userInfoService.login(userInfo);
    }

    /**
     * 用于对用户进行注册操作
     * 从当前模块注册用户全部处理为普通用户
     * 这里我们需要使用事务 如果其中一条Sql报错则回滚数据
     * */
    @RequestMapping("/register")
    public JsonData userRegister(UserInfo userInfo){
        return userInfoService.userRegister(userInfo);
    }

    /**
     *  查询数据库中是否已存在当前注册用户名
     * */
    @RequestMapping("/userNickNameRegister")
    public JsonData userNickNameRegister(UserInfo userInfo){
        return userInfoService.userNickNameRegister(userInfo);
    }

}
