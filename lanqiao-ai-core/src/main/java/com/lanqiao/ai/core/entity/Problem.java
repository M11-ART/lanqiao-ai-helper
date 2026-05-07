package com.lanqiao.ai.core.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 题目实体类
 */
@Data
@TableName("problem")
public class Problem {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String title;

    private String description;

    private String inputDesc;

    private String outputDesc;

    private String sampleInput;

    private String sampleOutput;

    private Integer timeLimit;

    private Integer memoryLimit;

    private String difficulty;

    private Integer contestYear;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;
}