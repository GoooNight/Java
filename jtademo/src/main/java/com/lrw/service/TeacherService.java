package com.lrw.service;

import com.lrw.entity.Teacher;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
public interface TeacherService {

    List<Teacher> allTeacher();

    int save(Teacher teacher);

}
