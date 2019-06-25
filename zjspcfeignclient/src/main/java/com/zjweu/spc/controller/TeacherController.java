package com.zjweu.spc.controller;

import com.zjweu.entity.Teacher;
import com.zjweu.spc.fegin.TeacherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherClient teacherClient;

    @GetMapping("fall")
    public List<Teacher> findAll(){
        return teacherClient.findAll();
    }
}
