package com.ruoyi.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Example {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
}
