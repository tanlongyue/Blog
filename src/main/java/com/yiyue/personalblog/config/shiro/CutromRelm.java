package com.yiyue.personalblog.config.shiro;

import com.yiyue.personalblog.entity.user.domain.Permission;
import com.yiyue.personalblog.entity.user.domain.Role;
import com.yiyue.personalblog.entity.user.domain.RolePermission;
import com.yiyue.personalblog.entity.user.domain.UserInfo;
import com.yiyue.personalblog.entity.user.example.PermissionExample;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import com.yiyue.personalblog.service.user.PermissionService;
import com.yiyue.personalblog.service.user.RolePermissionService;
import com.yiyue.personalblog.service.user.UserInfoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
/**
 * @ClassName: CutromRelm
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 22:45
 * @Modified By
 */
public class CutromRelm extends AuthorizingRealm {


    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private RolePermissionService rolePermissionService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private SessionDAO sessionDAO;
    /**
     * 用户授权操作
     * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        System.out.println("授权: doGetAuthorizationInfo");

        //获取登录用户的名称
        String username = (String) principalCollection.getPrimaryPrincipal();

        UserInfo user = new UserInfo();

        user.setUserNickName(username);

        //调用userService层的方法进行查询用户信息获取到UserNickName 并叫角色查询出来存放至RoleList中
        UserInfo byName = userInfoService.findByName(user);

        /**
         * 这里创建两个空的List集合 到后面进行使用 一个角色集合 一个权限名称集合
         * */
        List<String> stringRole = new ArrayList<>();
        List<String> stringpermissionList = new ArrayList<>();

        //进行使用foreach遍历
        for (Role role:byName.getRoleList()){
            //这里进行对角色集合里面添加角色名字
            stringRole.add(role.getRoleName());
            //进行封装数据 把遍历出来的一个role里面的PermissionId对象集合里去
            /**
             * 到此 User用户登陆信息已从数据库查询获取到
             * 到此 Role所有角色都已获取
             * 接下来获取 Role对应的权限
             * */
            RolePermission rolePermission = rolePermissionService.selectByPrimaryKey(role.getRoleId());
            //声明
            PermissionExample permissionExample = new PermissionExample();
            PermissionExample.Criteria criteria = permissionExample.createCriteria();
            criteria.andIdEqualTo(rolePermission.getId());
            List<Permission> byAllPerMission = permissionService.selectByExample(permissionExample);
            for (Permission per:byAllPerMission){
                stringpermissionList.add(per.getPermissionName()+per.getPermissionUrl());
            }
        }

        /**
         * 注意这里是SimpleAuthorizationInfo 而不是SimpleAuthenticationInfo这个对象
         * SimpleAuthorizationInfo是用来进行授权的
         * */
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(stringRole);
        simpleAuthorizationInfo.addStringPermissions(stringpermissionList);
        return simpleAuthorizationInfo;
    }

    /**
     * 用户登录认证的操作
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("认证: doGetAuthenticationInfo");

        //如果集成了redis那么需要如下设置
        String userNames = (String) authenticationToken.getPrincipal();
        String credentials = new String((char[])authenticationToken.getCredentials());
        UserInfo userInfo = new UserInfo();
        userInfo.setUserLoginName(userNames);
        UserInfo byName1 = userInfoService.findByName(userInfo);
        if(credentials.equals(userInfo.getUserPassword())){
            return null;
        }
//        //获取用户的面 如果为空登录认证失败!
//        String pwd = byName1.getUserPassword();
//        //如果用户的账号密码等于空的时候 则认证登陆失败
//        if(pwd == null || "".equals(pwd)){
//            return null;
//        }
        /**
         *  注意这里返回的时候是返回的user里面直接的password
         *  不能给上面的pwd放进去
         * */
        return new SimpleAuthenticationInfo(userNames, byName1.getUserPassword(), this.getClass().getName());
    }
}
