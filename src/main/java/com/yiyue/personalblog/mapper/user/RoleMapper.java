package com.yiyue.personalblog.mapper.user;

import com.yiyue.personalblog.entity.user.domain.Role;
import com.yiyue.personalblog.entity.user.example.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional //声明事物 防止脏数据进入数据库
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
}