package com.lrw.esdemo.controller;

import com.lrw.esdemo.entity.Teacher;
import com.lrw.esdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @author:awei
 * @date:2019/9/3
 * @ver:1.0
 **/
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("teacher")
    public Teacher queryTeacherByEs(Integer id){
        Teacher teacher = teacherService.queryTeacherByEs(id);
        return teacher;
    }

}
