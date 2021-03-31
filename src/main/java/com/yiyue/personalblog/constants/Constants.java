package com.yiyue.personalblog.constants;

/**
 * @ClassName: Constants
 * @Author:TanLongYue
 * @Description  常量类
 * @Date Created in 2020/10/20 23:21
 * @Modified By
 */
public class  Constants {

    /**
     * -------------------------------------------------通用信息--------------------------------------------------------
     * */

    public static final String SESSION= "SESSION";

    public static final String MSG = "MSG";

    public static final String MSG_SUCCESS = "成功";

    public static final String MSG_ERROR = "失败";

    public static final String MSG_TIMEOUT = "超时";

    public static final String MSG_IMAGE_FALSE = "请勿上传非图片文件";

    public static final String MSG_DISABLE = "该账号已被禁用";

    public static final String MSG_USERPASSWORDERROR = "账户密码错误";

    public static final String MSG_PERMISSION = "温馨提示:  您没有权限访问!!!";

    public static final String MSG_NOTLOGIN = "温馨提示： 抱歉您还没有登录!!!";

    public static final String TOKEN= "token";

    public static final String PTUSER="普通用户";

    public static final String LOGINOUT="退出登录成功";

    public static final Integer NUM_SCUESS= 200; //成功

    public static final Integer NUM_ERROR= 500; //失败

    public static final Integer NUM_TIMEOUT= 400; //参数错误

    public static final Integer NUM_DISABLE = 0;//游客

    public static final Integer NUM_PERMISSION = -2; //没权限

    public static final Integer NUM_NOTLOGIN = -3;  //未登录

    public static final Integer NUM_COMMON_ERROR = 999; // 通用报错无需清除登陆

    public static final String SHIROSESSION = "shiro:session:";



    /**
     * -------------------------------------------------Redis缓存--------------------------------------------------------
     * */

    /*
        最新推荐
    /*/
    public static final String LATEST_RECOMMENDATION = "LATEST_RECOMMENDATION";

    /*
        最新文章
    /*/
    public static final String LATEST_ARTICLES = "LATEST_ARTICLES";


    /*
        文章分类
     /*/
    public static final String LATEST_ARTICLE_CLASSIFICATION = "LATEST_ARTICLE_CLASSIFICATION";


    /*
        文章详情
     /*/
    public static final String LATEST_ARTICLE_DETAIL = "LATEST_ARTICLE_DETAIL";

}
