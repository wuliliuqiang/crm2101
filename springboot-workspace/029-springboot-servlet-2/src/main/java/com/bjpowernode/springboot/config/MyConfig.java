package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //声明此类为一个配置类，相当于一个xml配置文件
public class MyConfig {

    //@Bean注解是方法级别的一个注解
    //@Bean相当于 <beans><bean></bean></beans>

    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){

        //创建一个servlet注册bean对象
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet2","/myservlet3");


        return servletRegistrationBean;
    }

}
