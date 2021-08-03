package com.ygj.springboottest.handler;

import com.ygj.springboottest.exception.BusinessErrorException;
import com.ygj.springboottest.utils.JsonResult1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-03 11:18
 **/
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    //打印log
    private static final Logger logger =
            LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BusinessErrorException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public JsonResult1 handleHttpMessageNotReadableException(BusinessErrorException ex){
        String code = ex.getCode();
        String msg = ex.getMsg();
        return new JsonResult1(code,msg);
    }
}
