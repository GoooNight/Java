package com.zjweu.spc.service.impl;

import com.zjweu.entity.Teacher;
import com.zjweu.service.TeacherService;
import com.zjweu.spc.dao.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDAO teacherDAO;
    @Override
    public List<Teacher> findAll() {
        return teacherDAO.selectList(null);
    }

    @Override
    public Teacher findById(Integer tid) {
        return teacherDAO.selectById(tid);
    }
}
