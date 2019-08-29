package com.example.feigndemo.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.feigndemo.dao.userDAO;
import com.example.feigndemo.feignclent.TeacherClient;
import com.lrw.entity.Teacher;
import com.lrw.entity.User;
import com.lrw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/28
 * @ver:1.0
 **/
@RestController
public class TeacherController {

    @Autowired
    private TeacherClient teacherClient;

    @Autowired
    private UserService userService;

    @GetMapping("allTeacher")
    public List<Teacher> allTeacher(){
        List<Teacher> list = teacherClient.allTeacher();
        return list;
    }

    @GetMapping("user")
    public List<User> allUser(){
        List<User> list = userService.allUser();
        return list;
    }

    @GetMapping("add")
    @LcnTransaction
    @Transactional
    public String add(){
        User user = new User();
        user.setUserName("张三");
        userService.save(user);
        String s = teacherClient.saveTeacher();
        System.out.println(s);
        return "success----------"+s;
    }
}
