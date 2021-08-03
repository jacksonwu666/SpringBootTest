package com.ygj.springboottest.dto;

import lombok.Data;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-07-30 18:03
 **/

@Data
public class User {
    private Long id;
    private String username;
    private String password;


    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

}
