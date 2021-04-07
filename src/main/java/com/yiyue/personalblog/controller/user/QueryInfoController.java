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
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andIdEqualTo(userInfo.getId());
        List<UserInfo> userInfos = userInfoService.selectByExample(userInfoExample);
        //查询如果为空则List为0
        if(userInfos.size() > 0){
            userInfos.get(0).setUserPassword("");
            return JsonData.buildSuccess(userInfos.get(0),Constants.NUM_SCUESS);
        }
        return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
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
        Map<String,String> map = new HashMap<>();
        String path = "";
        try {
            if (null == file || file.isEmpty()) {
                if(userInfo != null){
                    if(userInfoService.updateByPrimaryKeySelective(userInfo) > 0 ){
                        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
                    }else{
                        return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
                    }
                }else{
                    return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
                }
            }else{
                String contentType = file.getContentType();
                if(!contentType.contains("image")){
                    return JsonData.buildError(Constants.MSG_IMAGE_FALSE,Constants.NUM_COMMON_ERROR);
                }
                String fileName = file.getOriginalFilename();
                System.out.println("这是文件名:"+fileName);
                String filepath = "D:/root/blog/userImage/"+userInfo.getUserLoginName()+"";//以自动生成的人才编号进行生成一个文件夹和文件夹里面的图片
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n"+filepath+"\n\n\n\n\n\n\n\n\n\n\n\n\n");
                File localFile = new File(filepath);
                if(!localFile .exists()) {
                    localFile.mkdirs();
                }
                path =filepath+"/"+fileName;
                log.info("这是文件路径:"+path);
                File server_file = new File(path);
                file.transferTo(server_file);
                if(userInfo != null){
                    userInfo.setUserHeadPortrait(path);
                    if(userInfoService.updateByPrimaryKeySelective(userInfo) > 0 ){
                        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
                    }
                }else{
                    return JsonData.buildError(Constants.MSG_ERROR,Constants.NUM_ERROR);
                }
            }
        } catch (Exception e) {
            log.info("文件上传异常"+e.getMessage(),e);
        }
        return JsonData.buildSuccess(Constants.MSG_SUCCESS,Constants.NUM_SCUESS);
    }



}
