package com.ygj.springboottest.controller;

import com.ygj.springboottest.dto.Blogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-02 18:39
 **/

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @RequestMapping("/test404")
    public String test404(){
        return "index";
    }
    @RequestMapping("/test500")
    public String test500(){
        int i = 1/0;
        return "index";
    }

    @RequestMapping("/getBlogger")
    public String getBlogger(Model model){
        Blogger blogger = new Blogger(1L,"wuxiang","123");
        model.addAttribute("blogger",blogger);
        return "blogger";
    }

    @RequestMapping("/getList")
    public String getBloggerInfo(Model model){
        List<Blogger> bloggers = new ArrayList<>();
        Blogger b1 = new Blogger(1L,"wuxiang1","123");
        Blogger b2 = new Blogger(2L,"wuxiang2","123");
        Blogger b3 = new Blogger(3L,"wuxiang3","123");
        bloggers.add(b1);
        bloggers.add(b2);
        bloggers.add(b3);
        model.addAttribute("blogger",bloggers);
        return "blogger";
    }
}
