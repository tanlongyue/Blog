package com.yiyue.personalblog.controller.user;

import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.user.domain.UserInfo;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import com.yiyue.personalblog.service.user.UserInfoService;
import com.yiyue.personalblog.service.user.UserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @ClassName: QueryInfoController
 * @Author:TanLongYue
 * @Description
 * 权限：需要登陆用户可操作
 * 功能点：
 *         修改时查询用户信息
 * @Date Created in 2020/12/11 21:32
 * @Modified By
 */

@RestController
@RequestMapping("/authc")
public class QueryInfoController {

    private Logger log = Logger.getLogger(QueryInfoController.class);

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private UserInfoService userInfoService;


    /**
     * 用户修改时查询对应的信息反显填充文本框
     * */
    @RequestMapping("/selectUserByUserId")
    public JsonData selectUserByUserId(@NotNull UserInfo userInfo){
        return userInfoService.selectUserByUserId(userInfo);
    }

    /**
     * 用于用户修改的时候可以随机获取服务器里面的图片进行修改等操作。
     * */
    @RequestMapping("/getPhoto")
    public JsonData getPhoto() {
        Random random = new Random();
        int number = random.nextInt(11);
        String address = "/pictures/"+(number+1)+".jpg";
        return JsonData.buildSuccess(address,Constants.NUM_SCUESS);
    }


    /**
     * 用户修改头像或修改信息。
     * @param file
     * @param userInfo
     * */
    @RequestMapping("updateUserSelect")
    public JsonData updateUserSelect(MultipartFile file,UserInfo userInfo){
        return userInfoService.updateUserSelect(file,userInfo);
    }



}
