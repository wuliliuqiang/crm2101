package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController     //相当于类上加@Controller+方法上加@ResponseBody
public class IndexController {

    /**
     * 该方法即支付get请求，也支持post请求
     * @return
     */
    @RequestMapping(value = "/index")
//    @ResponseBody
    public Object index(){
        return "index";
    }

    /**
     * 该方法只支持get请求
     * @return
     */
    @RequestMapping(value = "/index1",method = RequestMethod.GET)
//    @ResponseBody
    public Object index1(){
        return "index1 get method";
    }

    /**
     * 该方法只支持get请求
     * @return
     * 通常使用在查询操作
     */
    @GetMapping(value = "/index2")
//    @ResponseBody
    public Object index2(){
        return "index2 get method";
    }


    /**
     * 该方法只支持POST请求
     * @return
     */
    @RequestMapping(value = "/index3",method = RequestMethod.POST)
//    @ResponseBody
    public Object index3(){
        return "index3 post method";
    }

    /**
     * 该方法只支持post请求，通常用于新增操作
     * @return
     */
    @PostMapping(value = "/index4")
    public Object index4(){
        return "index4 only postMethod";
    }


    /**
     * 该方法只支持PUT请求,通常用于更新操作
     * @return
     */
    @RequestMapping(value = "/index5",method = RequestMethod.PUT)
//    @ResponseBody
    public Object index5(){
        return "index5 only putMethod";
    }

    @PutMapping(value = "/index6")
    public Object index6(){
        return "index6 only putMethod!!";
    }

    /**
     * 该方法只支持Delete请求,通常用于删除操作
     * @return
     */
    @RequestMapping(value = "/index7",method = RequestMethod.DELETE)
//    @ResponseBody
    public Object index7(){
        return "index7 only deleteMethod";
    }

    @DeleteMapping(value = "/index8")
    public Object index8(){
        return "index8 only deleteMethod!!";
    }
}
