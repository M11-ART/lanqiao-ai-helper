package com.lanqiao.ai.core.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lanqiao.ai.core.entity.Problem;

/**
 * 题目服务接口
 */
public interface ProblemService extends IService<Problem> {
    Page<Problem> getProblemPage(Integer pageNum, Integer pageSize, String difficulty);
}