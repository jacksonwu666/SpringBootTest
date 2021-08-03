package com.ygj.springboottest.exception;


/**
 * @version 1.0
 * @description: 业务异常提示信息枚举类
 * @author: WuXiang
 * @create: 2021-08-03 14:21
 **/
public enum BusniessMsgEnum {
    //参数异常
    PARMETER_EXCEPTION("102","参数异常"),

    //等待超时
    SERVICE_TIME_OUT("103","服务调用超时"),

    //参数过大
    PARMETER_BIG_EXCEPTION("103","输入的图片数量不能超过10张"),

    //500
    UNEXCPRED_EXCEPTION("500","系统发生异常，请联系管理员");


    //消息码
    private String code;
    //消息内容
    private String msg;

    BusniessMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    /**
     * 获取
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "BusniessMsgEnum{PARMETER_EXCEPTION = " + PARMETER_EXCEPTION + ", code = " + code + ", msg = " + msg + "}";
    }
}
