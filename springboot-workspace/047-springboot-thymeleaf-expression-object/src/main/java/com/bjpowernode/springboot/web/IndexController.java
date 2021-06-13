package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request, Model model){

        User user = new User();
        user.setId(1001);
        user.setUsername("wangwu");

        request.getSession().setAttribute("user",user);

        model.addAttribute("curTime",new Date());



        return "index";
    }
}
