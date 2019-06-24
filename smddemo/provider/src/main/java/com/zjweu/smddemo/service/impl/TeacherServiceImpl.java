package com.zjweu.smddemo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zjweu.entity.Teacher;
import com.zjweu.service.TeacherService;
import com.zjweu.smddemo.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0",interfaceClass = TeacherService.class)
@org.springframework.stereotype.Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.selectList(null);
    }

    @Override
    public boolean update(Teacher teacher) {
        return teacherMapper.updateById(teacher)>0?true:false;
    }

    @Override
    public boolean delete(Integer tid) {
        return teacherMapper.deleteById(tid)>0?true:false;
    }

    @Override
    public boolean save(Teacher teacher) {

        return teacherMapper.insert(teacher)>0?true:false;
    }
}
