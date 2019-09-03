package com.lrw.esdemo.service.impl;

import com.lrw.esdemo.entity.Teacher;
import com.lrw.esdemo.mapper.TeacherMapper;
import com.lrw.esdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @author:awei
 * @date:2019/9/3
 * @ver:1.0
 **/
@Service
public class TeacherServiceImpl implements TeacherService {


    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher queryTeacherByEs(Integer id) {
        Teacher teacher = new Teacher();
        teacher.setTid(1);
        teacher.setTname("张三");
        teacherMapper.save(teacher);
        return teacherMapper.queryTeacherByEs(id);
    }
}
