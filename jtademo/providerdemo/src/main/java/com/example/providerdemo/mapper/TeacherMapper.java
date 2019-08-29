package com.example.providerdemo.mapper;

import com.lrw.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
@Mapper
public interface TeacherMapper {
    List<Teacher> allTeacher();
    int save(Teacher teacher);
}
