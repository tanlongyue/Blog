package com.yiyue.personalblog.controller.Blog;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yiyue.personalblog.constants.Constants;
import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.domain.BlogType;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
import com.yiyue.personalblog.entity.blog.example.BlogTypeExample;
import com.yiyue.personalblog.entity.common.JsonData;
import com.yiyue.personalblog.service.blog.BlogService;
import com.yiyue.personalblog.service.blog.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: BlogToBlogTypeController
 * @Author:TanLongYue
 * @Description 文章分类 与 文章类
 * @Date Created in 2021/3/25 19:21
 * @Modified By
 */
@RestController
@RequestMapping("/pub")
public class BlogToBlogTypeController {

    @Autowired
    private BlogTypeService blogTypeService;

    @Autowired
    private BlogService blogService;


    /**
     * 查询分类类别
     * */
    @RequestMapping(value = "selectBlogTypeToCount",method = RequestMethod.GET)
    public JsonData selectBlogTypeToCount(){
       return  blogService.selectBlogTypeToCount();
    }

    /**
     * 分类点击查询
     * */
    @RequestMapping(value = "classifiedClickQuery",method = RequestMethod.GET)
    public JsonData classifiedClickQuery(Blog blog,String typeId){
        return  blogService.classifiedClickQuery(blog,typeId);
    }

    /**
     * 文章详情
     * */
    @RequestMapping(value = "blogDetailInfo",method = RequestMethod.POST)
    public JsonData blogDetailInfo(Blog blog){
       return  blogService.blogDetailInfo(blog);
    }

    /**
     * 文章浏览
     * */
    @RequestMapping(value = "addViews",method = RequestMethod.POST)
    public JsonData addViews(Blog blog){
        return blogService.addViews(blog);
    }
}
