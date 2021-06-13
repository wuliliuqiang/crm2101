package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {


    /**
     * 无需用户登录
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "INDEX";
    }


    /**
     * 无需用户登录
     * @return
     */
    @RequestMapping(value = "/user/page/login")
    public String loginPage(){
        return "Login Page";
    }

    @RequestMapping(value = "/user/login")
    public String login(HttpServletRequest request){
        User user = new User();
        user.setId(1);
        user.setUsername("lisi");

        request.getSession().setAttribute("user",user);

        return "Logged";
    }

    /**
     * 需要用户是登录状态
     * @return
     */
    @RequestMapping(value = "/user/center")
    public String center(){
        return "User Center";
    }
}
