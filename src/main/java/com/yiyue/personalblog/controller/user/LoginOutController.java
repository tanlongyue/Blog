package com.yiyue.personalblog.controller.user;

/**
 * @ClassName: LoginOutController
 * @Author:TanLongYue
 * @Description 功能点：
 *                      退出登录（out）
 * @Date Created in 2020/10/28 19:23
 * @Modified By
 */
import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.common.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@RestController
@RequestMapping("logout")
public class LoginOutController {

    @RequestMapping("/out")
    public JsonData out(HttpServletRequest request){
        /**
         * 清除session  并退出当前登录
         * */
        HttpSession session = request.getSession();
        session.removeAttribute(Constants.TOKEN);
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()){
            subject.logout();
        }
        return JsonData.buildSuccess(Constants.LOGINOUT,Constants.NUM_SCUESS);
    }

}
