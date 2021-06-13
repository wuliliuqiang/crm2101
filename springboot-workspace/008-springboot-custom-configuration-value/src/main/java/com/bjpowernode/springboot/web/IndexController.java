package com.bjpowernode.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${website}")
    private String website;

    @Value("${user.name}")
    private String username;

    @RequestMapping(value = "/index")
    public @ResponseBody Object index(){


        return "schoolName="+schoolName+",website="+website;
    }

    @RequestMapping(value = "/index1")
    public @ResponseBody Object index1(){


        return username;
    }
}
