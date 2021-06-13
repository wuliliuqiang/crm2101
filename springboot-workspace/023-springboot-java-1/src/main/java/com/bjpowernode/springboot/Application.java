package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.SomeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //run方法返回的ConfigurableApplicationContext就相当于之前的ClasspathXmlApplicationContext spring容器对象
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        //获取spring容器中的对象
        SomeService someService = (SomeService) applicationContext.getBean("someServiceImpl");

        //调用业务方法
        String hello = someService.hello();

        System.out.println(hello);


    }

}
