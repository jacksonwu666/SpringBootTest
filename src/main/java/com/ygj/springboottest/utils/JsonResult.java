package com.ygj.springboottest.utils;

import lombok.Data;

/**
 * @version 1.0
 * @description: 统一返回Json数据工具类
 * @author: WuXiang
 * @create: 2021-08-02 10:04
 **/
@Data
public class JsonResult<T>{
    private T data;
    private String code;
    private String msg;

    /**
     * @Description 没有返回数据，默认code和msg
     * @Date 上午 10:10 2021-08-02
     * @Param []
     * @return
     **/
    public JsonResult(){
        this.code = "0";
        this.msg = "操作成功！";
    }


    /**
     * @Description 无返回数据，自定义返回code和msg
     * @Date 上午 10:08 2021-08-02
     * @Param
     * @return
     **/
    public JsonResult(String code,String msg) {
        this.code = code;
        this.msg = "操作成功！";
    }

    /**
     * @Description 有返回数据时，默认code和msg
     * @Date 上午 10:12 2021-08-02
     * @Param [data]
     * @return
     **/

    public JsonResult(T data){
        this.code = "0";
        this.msg = "操作成功!";
        this.data = data;
    }


    /**
     * @Description 有返回数据时，自定义code和msg
     * @Date  2021-08-02
     * @Param [data, code, msg]
     * @return
     **/
    public JsonResult(T data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data,String msg){
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }

}
