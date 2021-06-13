package com.bjpowernode.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(){
        return "SpringBoot Jar Index";
    }



}
