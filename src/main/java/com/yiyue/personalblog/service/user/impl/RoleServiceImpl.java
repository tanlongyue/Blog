package com.yiyue.personalblog.service.user.impl;

import com.yiyue.personalblog.entity.user.domain.Role;
import com.yiyue.personalblog.entity.user.example.RoleExample;
import com.yiyue.personalblog.mapper.user.RoleMapper;
import com.yiyue.personalblog.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: RoleServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 23:12
 * @Modified By
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public long countByExample(RoleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RoleExample example) {
        return 0;
    }

    @Override
    public int insert(Role record) {
        return 0;
    }

    @Override
    public int insertSelective(Role record) {
        return 0;
    }

    @Override
    public List<Role> selectByExample(RoleExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Role record, RoleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Role record, RoleExample example) {
        return 0;
    }
}
