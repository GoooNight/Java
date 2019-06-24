package com.zjweu.service;

import com.zjweu.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();

    boolean update(Teacher teacher);

    boolean delete(Integer tid);

    boolean save(Teacher teacher);
}
