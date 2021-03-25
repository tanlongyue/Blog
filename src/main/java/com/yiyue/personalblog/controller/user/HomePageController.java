package com.yiyue.personalblog.controller.user;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiyue.personalblog.config.redis.RedisUtil;
import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.entity.user.example.UserInfoExample;
import com.yiyue.personalblog.service.blog.BlogService;
import com.yiyue.personalblog.service.blog.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: HomePageController
 * @Author:TanLongYue
 * @Description 用于对首页界面所有功能进行编写类。
 * @Date Created in 2021/2/11 15:21
 * @Modified By
 */

@RestController
@RequestMapping("/pub")
public class HomePageController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private BlogTypeService blogTypeService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 查询首页推荐图
     * */
    @RequestMapping("selectRecommend")
    public JsonData selectRecommend(){
        String recommendAtion = stringRedisTemplate.opsForValue().get(Constants.LATEST_RECOMMENDATION);
        List<Blog> blogs;
        if(recommendAtion != null){
            blogs = (List<Blog>) JSONObject.parse(recommendAtion);
        }else{
            blogs = blogService.selectRecommend();
            //存入Redis 并设置失效时间2400秒
            stringRedisTemplate.opsForValue().set(Constants.LATEST_RECOMMENDATION,JSONObject.toJSONString(blogs),2400, TimeUnit.SECONDS);
        }
        return JsonData.buildSuccess(blogs,200);
    }

    /**
     * 查询首页最新文章
     * */
    @RequestMapping("selectPublished")
    public JsonData selectPublished(Blog blog){
        PageHelper.startPage(blog.getPageNum(),blog.getPageSize());
        List<Blog> lists  = blogService.selectPublished(blog,"");
        PageInfo<Blog> pageInfo = new PageInfo<>(lists);
        return JsonData.buildSuccess(pageInfo,200);
    }
}
