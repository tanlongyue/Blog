package com.yiyue.personalblog.service.blog;

import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
import com.yiyue.personalblog.entity.common.JsonData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: BlogService
 * @Author:TanLongYue
 * @Description
 * @Date Created in 2021/2/28 18:52
 * @Modified By
 */
public interface BlogService {


    List<Blog> selectRecommend();

    List<Blog> selectPublished(Blog blog,@Param("typeId")String typeId);

    Integer findBlogCount(String typeId);
    /**
     * 文章信息
     * */
    Blog findArDetailInfo(BlogExample example);

    /***
     * 查询文章数量
     */
    Integer findViewsCount();

    /**
     * 查询首页最新文章
     * */
    JsonData selectPublished(Blog blog);


    /**
     * 文章浏览
     * */
    JsonData addViews(Blog blog);


    /**
     * 文章详情
     * */
    JsonData blogDetailInfo(Blog blog);

    /**
     * 分类点击查询
     * */
    JsonData classifiedClickQuery(Blog blog,String typeId);

    /**
     * 查询分类类别
     * */
    JsonData selectBlogTypeToCount();
}
