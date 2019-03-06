package com.mydubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mydubbo.api.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyingjie
 * @Title: UserController
 * @Description: ss
 * @date 2019/3/1
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/hi")
    public String hi(String name){
        System.out.println("hi");
        return userService.getUser(name);
    }

}
