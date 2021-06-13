package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.SomeService;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {


    @Override
    public String hello() {
        return "Hello SpringBoot Java Project-1";
    }
}
