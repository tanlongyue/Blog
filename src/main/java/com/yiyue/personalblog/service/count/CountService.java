package com.yiyue.personalblog.service.count;

import com.yiyue.personalblog.entity.count.domain.Count;
import com.yiyue.personalblog.entity.count.example.CountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountService {
    long countByExample(CountExample example);

    int deleteByExample(CountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Count record);

    int insertSelective(Count record);

    List<Count> selectByExample(CountExample example);

    Count selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Count record, @Param("example") CountExample example);

    int updateByExample(@Param("record") Count record, @Param("example") CountExample example);

    int updateByPrimaryKeySelective(Count record);

    int updateByPrimaryKey(Count record);
}
