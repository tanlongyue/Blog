package com.yiyue.personalblog.service.user;

import com.yiyue.personalblog.entity.user.domain.RolePermission;
import com.yiyue.personalblog.entity.user.example.RolePermissionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RolePermissionService {


    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(Integer id);

}
