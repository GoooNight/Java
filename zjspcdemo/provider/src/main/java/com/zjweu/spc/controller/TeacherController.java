package com.zjweu.spc.controller;

import com.zjweu.entity.Teacher;
import com.zjweu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Value("${server.port}")
    private String port;

    @GetMapping("all")
    public List<Teacher> findAll() {
        System.out.println(port);
        return teacherService.findAll();
    }

    @GetMapping("teacher/{tid}")
    public Teacher findById(@PathVariable("tid") Integer tid){
        return teacherService.findById(tid);
    }

}
