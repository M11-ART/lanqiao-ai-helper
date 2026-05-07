-- 创建数据库
CREATE DATABASE IF NOT EXISTS lanqiao_ai DEFAULT CHARSET utf8mb4;

USE lanqiao_ai;

-- 用户表
CREATE TABLE `user` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `username` VARCHAR(50) NOT NULL COMMENT '用户名',
    `password` VARCHAR(100) NOT NULL COMMENT '密码',
    `email` VARCHAR(100) COMMENT '邮箱',
    `solved_count` INT DEFAULT 0 COMMENT '已解决题目数',
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 题目表
CREATE TABLE `problem` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '题目ID',
    `title` VARCHAR(200) NOT NULL COMMENT '题目标题',
    `description` TEXT NOT NULL COMMENT '题目描述',
    `input_desc` TEXT COMMENT '输入描述',
    `output_desc` TEXT COMMENT '输出描述',
    `sample_input` TEXT COMMENT '样例输入',
    `sample_output` TEXT COMMENT '样例输出',
    `time_limit` INT DEFAULT 1000 COMMENT '时间限制(ms)',
    `memory_limit` INT DEFAULT 256 COMMENT '内存限制(MB)',
    `difficulty` VARCHAR(20) DEFAULT 'EASY' COMMENT '难度',
    `contest_year` INT COMMENT '竞赛年份',
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='题目表';

-- 提交记录表
CREATE TABLE `submission` (
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '提交ID',
    `user_id` BIGINT NOT NULL COMMENT '用户ID',
    `problem_id` BIGINT NOT NULL COMMENT '题目ID',
    `code` TEXT NOT NULL COMMENT '提交代码',
    `language` VARCHAR(20) DEFAULT 'JAVA' COMMENT '编程语言',
    `status` VARCHAR(50) DEFAULT 'PENDING' COMMENT '状态',
    `time_used` INT COMMENT '运行时间(ms)',
    `memory_used` INT COMMENT '内存使用(MB)',
    `error_msg` TEXT COMMENT '错误信息',
    `created_at` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
    PRIMARY KEY (`id`),
    KEY `idx_user_id` (`user_id`),
    KEY `idx_problem_id` (`problem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='提交记录表';