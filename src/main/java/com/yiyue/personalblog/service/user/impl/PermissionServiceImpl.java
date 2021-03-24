package com.yiyue.personalblog.service.user.impl;

import com.yiyue.personalblog.entity.user.domain.Permission;
import com.yiyue.personalblog.entity.user.example.PermissionExample;
import com.yiyue.personalblog.mapper.user.PermissionMapper;
import com.yiyue.personalblog.service.user.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PermissionServiceImpl
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2020/10/19 23:13
 * @Modified By
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public long countByExample(PermissionExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(PermissionExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Permission record) {
        return 0;
    }

    @Override
    public int insertSelective(Permission record) {
        return 0;
    }

    @Override
    public List<Permission> selectByExample(PermissionExample example) {
        return null;
    }

    @Override
    public Permission selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Permission record, PermissionExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Permission record, PermissionExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return 0;
    }
}
