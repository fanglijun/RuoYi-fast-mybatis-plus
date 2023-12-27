package com.ruoyi.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.example.domain.Example;
import com.ruoyi.example.mapper.ExampleMapper;
import org.springframework.stereotype.Service;

@Service
public class ExampleService extends ServiceImpl<ExampleMapper, Example> {
}
