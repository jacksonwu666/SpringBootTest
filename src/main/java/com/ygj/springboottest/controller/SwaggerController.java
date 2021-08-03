package com.ygj.springboottest.controller;

import com.ygj.springboottest.dto.User;
import com.ygj.springboottest.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-02 16:41
 **/
@RestController
@RequestMapping("/swagger")
@Api(value = "Swagger2 在线接口文档")
public class SwaggerController {
    @GetMapping("/get/{id}")
    @ApiOperation("根据用户唯一表示获取用户信息")
    public JsonResult<User> getUserInfo(@PathVariable  @ApiParam(value = "用户唯一标识") Long id){
        User user = new User(id,"zhangsan","123");
        return new JsonResult<>(user,"获取user信息成功！");
    }

    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult<User> insert(@RequestBody @ApiParam(value = "用户信息") User user){
        return new JsonResult<>(user,"添加用户成功！");
    }

}
