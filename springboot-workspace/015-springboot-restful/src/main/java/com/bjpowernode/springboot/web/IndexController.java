package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping(value = "/student/detail")
    public @ResponseBody Object studentDetail(Integer id){
        return "ID -> " + id;
    }

    @GetMapping(value = "/student/detail/{id}")
    public @ResponseBody Object studentDetail1(@PathVariable("id") Integer id){
        return "ID -> " + id;
    }

    @GetMapping(value = "/student/detail/{id}/{name}")
    public @ResponseBody Object studentDetail2(@PathVariable("id") Integer id,
                                               @PathVariable("name") String name){
        return "ID -> " + id + ",name -> " + name;
    }

    @PostMapping(value = "/student/detail/{id}/{address}")
    public @ResponseBody Object studentDetail3(@PathVariable("id") Integer id,
                                               @PathVariable("address") Integer address){
        return "ID -> " + id + ",address -> " + address;
    }
}
