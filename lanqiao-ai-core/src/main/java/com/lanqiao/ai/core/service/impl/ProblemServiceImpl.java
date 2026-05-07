package com.lanqiao.ai.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lanqiao.ai.core.entity.Problem;
import com.lanqiao.ai.core.mapper.ProblemMapper;
import com.lanqiao.ai.core.service.ProblemService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 题目服务实现类
 */
@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem> implements ProblemService {

    @Override
    public Page<Problem> getProblemPage(Integer pageNum, Integer pageSize, String difficulty) {
        Page<Problem> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Problem> wrapper = new LambdaQueryWrapper<>();
        
        if (StringUtils.hasText(difficulty)) {
            wrapper.eq(Problem::getDifficulty, difficulty);
        }
        
        wrapper.orderByDesc(Problem::getContestYear);
        return this.page(page, wrapper);
    }
}