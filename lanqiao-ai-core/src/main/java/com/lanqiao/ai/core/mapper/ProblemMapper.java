package com.lanqiao.ai.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lanqiao.ai.core.entity.Problem;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目Mapper接口
 */
@Mapper
public interface ProblemMapper extends BaseMapper<Problem> {
}