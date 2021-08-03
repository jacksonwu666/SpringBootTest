package com.ygj.springboottest.controller;

import com.ygj.springboottest.dto.User;
import com.ygj.springboottest.utils.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @description: Json控制层
 * @author: WuXiang
 * @create: 2021-07-30 18:02
 **/

@RestController
@RequestMapping("/json")
public class JsonController {

    @PostMapping ("/getuser")
    public JsonResult<User> getUser() {
        User user = new User(1L, "wuxiang", "123");
        return new JsonResult<>(user);
    }

    @RequestMapping(value = "/getlist",method = RequestMethod.GET)
    public JsonResult<List<User>> getList() {
        List<User> users = new ArrayList<>();
        User u1 = new User(1L, "wuxiang1", "123");
        User u2 = new User(2L, "wuxiang2", "123");
        users.add(u1);
        users.add(u2);
        return new JsonResult<>(users,"获取成功！");
    }

    @RequestMapping(value = "/getmap",method = RequestMethod.POST)
    public JsonResult<Map<String,User>> getMap() {
        Map<String, User> maps = new HashMap<>();
        User u1 = new User(1L, "wu1", "123");
        User u2 = new User(2L, "wu2", "123");
        maps.put("user1", u1);
        maps.put("user2", u2);
        return new JsonResult<>(maps,"获取成功！");
    }

    @RequestMapping("/getnullvalue")
    public User  testNullValue(){
        return new User(1L,"wuxiang",null);
    }



}
