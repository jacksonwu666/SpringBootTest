package com.ygj.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: hello控制层
 * @author: WuXiang
 * @create: 2021-07-30 17:50
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/start")
    public String  Hello() {
        return "hello Springboot!";
    }

}
