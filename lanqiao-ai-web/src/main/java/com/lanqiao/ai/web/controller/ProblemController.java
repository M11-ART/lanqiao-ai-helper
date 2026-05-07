package com.lanqiao.ai.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lanqiao.ai.common.Result;
import com.lanqiao.ai.core.entity.Problem;
import com.lanqiao.ai.core.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 题目控制器
 */
@RestController
@RequestMapping("/api/problem")
@RequiredArgsConstructor
public class ProblemController {

    private final ProblemService problemService;

    /**
     * 分页获取题目列表
     */
    @GetMapping("/list")
    public Result<Page<Problem>> getProblemList(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(required = false) String difficulty) {
        Page<Problem> page = problemService.getProblemPage(pageNum, pageSize, difficulty);
        return Result.success(page);
    }

    /**
     * 获取题目详情
     */
    @GetMapping("/{id}")
    public Result<Problem> getProblemDetail(@PathVariable Long id) {
        Problem problem = problemService.getById(id);
        return Result.success(problem);
    }

    /**
     * 创建题目（管理员）
     */
    @PostMapping
    public Result<Void> createProblem(@RequestBody Problem problem) {
        problemService.save(problem);
        return Result.success();
    }
}