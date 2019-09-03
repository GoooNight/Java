package com.lrw.provider.controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @author:awei
 * @date:2019/9/2
 * @ver:1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user")
    public List<User> allUser(Integer page,Integer limit){
        return userService.allUser(page,limit);
    }

    @GetMapping("teacher")
    public List<Map<String, Object>> allTeacher(){
        return userService.allTeacher();
    }

}
