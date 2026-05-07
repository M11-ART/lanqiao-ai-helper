package com.lanqiao.ai.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 蓝桥杯智能刷题系统启动类
 */
@SpringBootApplication(scanBasePackages = "com.lanqiao.ai")
@MapperScan("com.lanqiao.ai.core.mapper")
public class LanqiaoAiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LanqiaoAiApplication.class, args);
        System.out.println("========================================");
        System.out.println("  蓝桥杯智能刷题系统启动成功！");
        System.out.println("  正在集成小米MiMo-V2.5模型...");
        System.out.println("========================================");
    }
}