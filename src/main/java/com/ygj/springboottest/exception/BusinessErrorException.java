package com.ygj.springboottest.exception;

import lombok.Data;

/**
 * @version 1.0
 * @description: 自定义业务异常类
 * @author: WuXiang
 * @create: 2021-08-03 14:32
 **/
@Data
public class BusinessErrorException extends RuntimeException{
    private static final long serialVersionUID = -3356257141210370731L;

    private String code;
    private String msg;

    public BusinessErrorException(BusniessMsgEnum busniessMsgEnum){
        this.code = busniessMsgEnum.getCode();
        this.msg = busniessMsgEnum.getMsg();
    }

}
