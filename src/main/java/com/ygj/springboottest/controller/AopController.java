package com.ygj.springboottest.controller;

import com.ygj.springboottest.exception.BusinessErrorException;
import com.ygj.springboottest.exception.BusniessMsgEnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-03 17:16
 **/
@RestController
@RequestMapping("/aop")
public class AopController {

    @RequestMapping("/{name}")
    public String testAop(@PathVariable("name") String name){
        return "Hello" + name;
    }
    @RequestMapping("/aopExp/{name}")
    public String testAopException(@PathVariable("name") String name){
        try{
            int i = 1/0;
        }catch (Exception e){
            throw new BusinessErrorException(BusniessMsgEnum.UNEXCPRED_EXCEPTION);
        }
        return "hello"+name;
    }
}
