package com.yiyue.personalblog.service.user.impl;

import com.yiyue.personalblog.entity.user.domain.RolePermission;
import com.yiyue.personalblog.entity.user.example.RolePermissionExample;
import com.yiyue.personalblog.mapper.user.RolePermissionMapper;
import com.yiyue.personalblog.service.user.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: RolePermissionServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 23:11
 * @Modified By
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public long countByExample(RolePermissionExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(RolePermissionExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(RolePermission record) {
        return 0;
    }

    @Override
    public int insertSelective(RolePermission record) {
        return rolePermissionMapper.insertSelective(record);
    }

    @Override
    public List<RolePermission> selectByExample(RolePermissionExample example) {
        return null;
    }

    @Override
    public RolePermission selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(RolePermission record, RolePermissionExample example) {
        return 0;
    }

    @Override
    public int updateByExample(RolePermission record, RolePermissionExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(RolePermission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(RolePermission record) {
        return 0;
    }
}
