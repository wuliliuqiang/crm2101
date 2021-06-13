package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.City;
import com.bjpowernode.springboot.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private City city;

    @RequestMapping(value = "/school")
    public @ResponseBody Object school(){

        return "school.name="+school.getName()+",school.website="+school.getWebsite();
    }

    @RequestMapping(value = "/city")
    public @ResponseBody Object city(){

        return "city.name="+city.getName()+",city.website="+city.getWebsite();
    }
}
