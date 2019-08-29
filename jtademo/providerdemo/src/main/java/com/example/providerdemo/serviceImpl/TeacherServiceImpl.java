package com.example.providerdemo.serviceImpl;

import com.example.providerdemo.mapper.TeacherMapper;
import com.lrw.entity.Teacher;
import com.lrw.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;


    @Override
    public List<Teacher> allTeacher() {
        return teacherMapper.allTeacher();
    }

    @Override
    public int save(Teacher teacher) {
        return teacherMapper.save(teacher);
    }
}
