package com.yiyue.personalblog.service.user.impl;

import com.yiyue.personalblog.entity.user.domain.UserRole;
import com.yiyue.personalblog.entity.user.example.UserRoleExample;
import com.yiyue.personalblog.mapper.user.UserRoleMapper;
import com.yiyue.personalblog.service.user.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserRoleServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 23:09
 * @Modified By
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public long countByExample(UserRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserRole record) {
        return 0;
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public List<UserRole> selectByExample(UserRoleExample example) {
        return null;
    }

    @Override
    public UserRole selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserRole record, UserRoleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserRole record, UserRoleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return 0;
    }
}
