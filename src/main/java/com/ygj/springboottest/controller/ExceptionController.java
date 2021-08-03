package com.ygj.springboottest.controller;

import com.ygj.springboottest.exception.BusinessErrorException;
import com.ygj.springboottest.exception.BusniessMsgEnum;
import com.ygj.springboottest.utils.JsonResult1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-03 11:45
 **/
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    private static final Logger logger =
            LoggerFactory.getLogger(ExceptionController.class);

    @PostMapping("/test")
    public JsonResult1 test(@RequestParam("name") String name,@RequestParam("pass") String pass){
        logger.info("name :{}",name);
        logger.info("pass :{}",pass);
        return new JsonResult1();
    }


    @RequestMapping("/business")
    public JsonResult1 testBusinessException(){
        try{
            int i = 1/0;
        }catch (Exception e){
            throw new BusinessErrorException(BusniessMsgEnum.UNEXCPRED_EXCEPTION);
        }

        return new JsonResult1();

    }



}
