package com.yiyue.personalblog.service.user;

import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.user.domain.UserInfo;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.util.List;


public interface UserInfoService {

    /**
     * 登陆的时候Auth授权认证信息
     *
     * */
    UserInfo findByName(UserInfo userInfo);


    /**
     * 用户登陆操作
     * */
    JsonData login(UserInfo userInfo);


    /**
     * 用于对用户进行注册操作
     * 从当前模块注册用户全部处理为普通用户
     * 这里我们需要使用事务 如果其中一条Sql报错则回滚数据
     * */
    JsonData userRegister(UserInfo userInfo);


    /**
     *  查询数据库中是否已存在当前注册用户名
     * */
    JsonData userNickNameRegister(UserInfo userInfo);


    /**
     * 用户修改时查询对应的信息反显填充文本框
     * */
    JsonData selectUserByUserId(UserInfo userInfo);


    /**
     * 用户修改头像或修改信息。
     * @param file
     * @param userInfo
     * */
    JsonData updateUserSelect(MultipartFile file, UserInfo userInfo);
}
