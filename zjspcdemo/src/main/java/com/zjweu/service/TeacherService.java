package com.zjweu.service;

import com.zjweu.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();

    Teacher findById(Integer tid);

}
