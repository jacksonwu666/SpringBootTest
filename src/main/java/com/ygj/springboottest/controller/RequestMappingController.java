package com.ygj.springboottest.controller;

import com.ygj.springboottest.dto.User;
import com.ygj.springboottest.utils.JsonResult;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @description: RequestMapping 控制层 测试类
 * @author: WuXiang
 * @create: 2021-08-02 15:44
 **/
@RestController
@RequestMapping("/mappingtest")
public class RequestMappingController {
    @GetMapping("/user/{id}/{name}")
    public JsonResult<User> getMapping(@PathVariable String id, @PathVariable String name){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        User user = new User();
        user.setId(Long.parseLong(id));
        user.setUsername(name);
        return new JsonResult<>(user,"注册成功！");
    }
    @PostMapping("/form")
    public JsonResult<User> getMapping1(@RequestParam String id,@RequestParam String username){
        User u = new User();
        u.setId(Long.parseLong(id));
        u.setUsername(username);
        return new JsonResult<>(u,"注册成功！");
    }

    @PostMapping("/form1")
    public JsonResult<User> testForm(User user){
        return new JsonResult<>(user,"注册成功！");
    }

    @PostMapping("/user")
    public String testRequestBody(@RequestBody User user){
        System.out.println(user);
        return "success";
    }

}
