package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/expression")
    public String expression(Model model){

        model.addAttribute("data","后台获取的数据");
        model.addAttribute("flag",true);
        model.addAttribute("sex",1);

        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");
        model.addAttribute("user",user);


        return "expression";
    }
}
