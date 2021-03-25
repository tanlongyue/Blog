package com.yiyue.personalblog.service.blog;

import com.yiyue.personalblog.entity.blog.domain.Blog;
import com.yiyue.personalblog.entity.blog.example.BlogExample;
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

    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogid);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    Blog selectByPrimaryKey(Integer blogid);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> selectRecommend();

    List<Blog> selectPublished(Blog blog,@Param("typeId")String typeId);

    Integer findBlogCount(String typeId);
}
