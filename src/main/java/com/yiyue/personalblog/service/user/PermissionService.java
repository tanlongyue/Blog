package com.yiyue.personalblog.service.user;

import com.yiyue.personalblog.entity.user.domain.Permission;
import com.yiyue.personalblog.entity.user.example.PermissionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PermissionService  {


    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

}
