package com.yiyue.personalblog.service.user.impl;

import com.yiyue.personalblog.entity.user.domain.Role;
import com.yiyue.personalblog.entity.user.domain.UserInfo;
import com.yiyue.personalblog.entity.user.domain.UserRole;
import com.yiyue.personalblog.entity.user.example.RoleExample;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import com.yiyue.personalblog.entity.user.example.UserRoleExample;
import com.yiyue.personalblog.mapper.user.RoleMapper;
import com.yiyue.personalblog.mapper.user.UserInfoMapper;
import com.yiyue.personalblog.mapper.user.UserRoleMapper;
import com.yiyue.personalblog.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserInfoServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 23:07
 * @Modified By
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public long countByExample(UserInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    @Override
    public List<UserInfo> selectByExample(UserInfoExample example) {

        return userInfoMapper.selectByExample(example);
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserInfo record, UserInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserInfo record, UserInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

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
}
