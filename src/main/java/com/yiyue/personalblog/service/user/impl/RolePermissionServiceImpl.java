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
    public int insertSelective(RolePermission record) {
        return rolePermissionMapper.insertSelective(record);
    }

    @Override
    public List<RolePermission> selectByExample(RolePermissionExample example) {
        return rolePermissionMapper.selectByExample(example);
    }

    @Override
    public RolePermission selectByPrimaryKey(Integer id) {
        return rolePermissionMapper.selectByPrimaryKey(id);
    }

}
