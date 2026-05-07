# 蓝桥杯智能刷题与代码优化系统
基于大模型的算法竞赛学习平台，专为蓝桥杯等编程竞赛设计，集成小米MiMo-V2.5大模型实现AI智能辅助。

## 项目简介
这是一个集题目管理、在线评测、AI题解生成、代码优化建议于一体的智能刷题系统，面向编程竞赛学习者打造。

## 核心功能
1. 题目管理：支持蓝桥杯历年真题录入、分类、分页查询
2. 在线评测：支持代码提交与安全沙箱判题
3. AI智能题解：集成小米MiMo-V2.5大模型，依托100万超长上下文生成详细题解
4. 代码优化：AI自动分析代码，提供复杂度优化建议

## 技术栈
后端框架：Spring Boot 3.2.5
ORM框架：MyBatis Plus 3.5.5
数据库：MySQL 8.0
AI引擎：小米MiMo-V2.5
构建工具：Maven
JDK版本：17

## 项目结构
lanqiao-ai-helper/
├── lanqiao-ai-common    # 公共模块（统一响应、异常处理）
├── lanqiao-ai-core      # 核心业务模块（题目、用户相关业务）
├── lanqiao-ai-judge     # 评测模块（代码判题、沙箱逻辑）
├── lanqiao-ai-ai        # AI服务模块（小米MiMo模型集成）
└── lanqiao-ai-web       # Web启动模块（接口、配置、启动类）

## 关于小米MiMo集成
本项目专为小米MiMo-V2.5大模型设计开发，核心应用：
1. 100万超长上下文：完整处理题目、代码、测试用例
2. 代码理解能力：精准生成题解、代码注释、纠错建议
3. Agent智能助教：实现自动答疑、学习指导功能

## 快速开始
1. 克隆项目：git clone https://github.com/M11-ART/lanqiao-ai-helper.git
2. 进入项目：cd lanqiao-ai-helper
3. 配置数据库：修改application.yml中的MySQL账号密码
4. 编译项目：mvn clean package
5. 启动项目：java -jar lanqiao-ai-web/target/lanqiao-ai-web-1.0.0.jar
6. 接口访问：http://localhost:8080/api/problem/list

## 许可证
MIT License