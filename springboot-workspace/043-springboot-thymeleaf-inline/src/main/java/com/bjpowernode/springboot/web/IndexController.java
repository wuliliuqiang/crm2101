package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model){

        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");

        model.addAttribute("user",user);

        return "index";
    }
}
