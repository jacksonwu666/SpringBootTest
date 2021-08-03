package com.ygj.springboottest.handler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @version 1.0
 * @description: 日志切面处理器
 * @author: WuXiang
 * @create: 2021-08-03 15:40
 **/
@Aspect
@Component
public class LogAspectHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.ygj.springboottest.controller..*.*(..))")
    public void poinCut(){
    }

    @Before("poinCut()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("===doBefore方法进入了===");
        //获取签名
        Signature signature = joinPoint.getSignature();
        //获取切入的包名
        String declaringTypeName = signature.getDeclaringTypeName();
        //获取即将执行的方法名
        String funcName = signature.getName();
        logger.info("即将执行的方法,{},属于{}包",funcName,declaringTypeName);
        //请求的url和ip
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //获得url 和 ip
        String url = request.getRequestURI();
        String ip = request.getRemoteAddr();
        logger.info("用户请求的url为：{},ip为：{}",url,ip);

    }
    @After("poinCut()")
    public void doAfter(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        String method = signature.getName();
        logger.info("方法{}已执行完",method);
    }

    @AfterReturning(pointcut = "poinCut()",returning = "result")
    public void doAfterReturning(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        String method = signature.getName();
        logger.info("方法{}执行完毕，返回参数{}",method,result);
        //需要增强的方法
        logger.info("对返回的参数进行业务上的增强：{}",result+"增强版");
    }


    @AfterThrowing(pointcut = "poinCut()",throwing = "ex")
    public void doAfterThrowing(JoinPoint joinPoint,Throwable ex){
        Signature signature = joinPoint.getSignature();
        String method = signature.getName();
        logger.info("执行{}出错了，异常为{}",method,ex);
    }



}
