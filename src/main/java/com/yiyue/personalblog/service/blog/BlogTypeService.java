package com.yiyue.personalblog.service.blog;

import com.yiyue.personalblog.entity.blog.domain.BlogType;
import com.yiyue.personalblog.entity.blog.example.BlogTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogTypeService {

    long countByExample(BlogTypeExample example);

    int deleteByExample(BlogTypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(BlogType record);

    int insertSelective(BlogType record);

    List<BlogType> selectByExample(BlogTypeExample example);

    BlogType selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") BlogType record, @Param("example") BlogTypeExample example);

    int updateByExample(@Param("record") BlogType record, @Param("example") BlogTypeExample example);

    int updateByPrimaryKeySelective(BlogType record);

    int updateByPrimaryKey(BlogType record);
}
