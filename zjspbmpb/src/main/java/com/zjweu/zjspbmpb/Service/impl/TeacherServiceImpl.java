package com.zjweu.zjspbmpb.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjweu.zjspbmpb.Service.TeacherService;
import com.zjweu.zjspbmpb.entity.Teacher;
import com.zjweu.zjspbmpb.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> findAll() {
        List<Teacher> list = teacherMapper.selectList(null);

        return list;
    }

    @Override
    public Teacher findByTid(Integer tid) {
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper();
        queryWrapper.eq("tid",tid);
        Teacher teacher = teacherMapper.selectOne(queryWrapper);
        return teacher;
    }

    @Override
    public IPage<Teacher> findByPage(Integer page) {
        IPage<Teacher> teacherIPage = teacherMapper.selectPage(new Page<Teacher>(page,1),null);
        return teacherIPage;
    }

    @Override
    public boolean update(Teacher teacher) {
        return teacherMapper.updateById(teacher)>0?true:false;
    }

    @Override
    public boolean delete(Integer cid) {

        return teacherMapper.deleteById(cid)>0?true:false;
    }

    @Override
    public boolean save(Teacher teacher) {

        return teacherMapper.insert(teacher)>0?true:false;
    }

}
