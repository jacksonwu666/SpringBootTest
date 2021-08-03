package com.ygj.springboottest.dto;

import lombok.Data;


/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-03 09:52
 **/
@Data
public class Blogger {
    private Long id;
    private String name;
    private String pwd;


    public Blogger(Long id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
