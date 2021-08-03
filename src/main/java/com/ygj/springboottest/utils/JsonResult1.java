package com.ygj.springboottest.utils;

import lombok.Data;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-03 11:12
 **/
@Data
public class JsonResult1 {
    //异常码
    private String code;
    //异常信息
    private String msg;

    public JsonResult1(){
        this.code = "200";
        this.msg = "操作成功！";
    }

    public JsonResult1(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
