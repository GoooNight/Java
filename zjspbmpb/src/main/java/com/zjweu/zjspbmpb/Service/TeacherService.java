package com.zjweu.zjspbmpb.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjweu.zjspbmpb.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();

    Teacher findByTid(Integer tid);

    IPage<Teacher> findByPage(Integer page);

    boolean update(Teacher teacher);

    boolean delete(Integer cid);

    boolean save(Teacher teacher);
}
