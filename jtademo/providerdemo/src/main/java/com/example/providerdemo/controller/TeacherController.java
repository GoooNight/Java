package com.example.providerdemo.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lrw.entity.Teacher;
import com.lrw.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("allTeacher")
    public List<Teacher> allTeacher(){
        List<Teacher> list = teacherService.allTeacher();
        return list;
    }
    @GetMapping("saveTeacher")
    @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public String saveTeacher() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setTid(1);
        teacher.setTName("李四老师");
        int save = teacherService.save(teacher);
//        throw new Exception("error");
        return save>0?"success":"fail";

    }
}
