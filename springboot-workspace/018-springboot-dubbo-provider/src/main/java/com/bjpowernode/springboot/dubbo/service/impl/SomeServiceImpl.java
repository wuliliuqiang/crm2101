package com.bjpowernode.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.dubbo.service.SomeService;
import org.springframework.stereotype.Component;

@Component
//@Service 相当于dubbo:service interface="" ref="" version="" timeout=""
@Service(interfaceClass = SomeService.class,version = "1.0.0",timeout = 35000)
public class SomeServiceImpl implements SomeService {

    @Override
    public String hello() {
        return "Hello SpringBoot集成Dubbo";
    }
}
