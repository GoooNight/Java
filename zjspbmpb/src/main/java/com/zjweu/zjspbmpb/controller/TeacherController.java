package com.zjweu.zjspbmpb.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjweu.zjspbmpb.Service.TeacherService;
import com.zjweu.zjspbmpb.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @GetMapping("/teachers")
    public List<Teacher> findAll(){
        List<Teacher> teachers = (List<Teacher>) redisTemplate.opsForValue().get("teachers");
        if (teachers==null){
            System.out.println("来自数据库");
            teachers = teacherService.findAll();
            redisTemplate.opsForValue().set("teachers",teachers);
        }else {
            System.out.println("来自redis");
        }
        return teachers;
    }
    @GetMapping("/one/{tid}")
    public Teacher findByTid(@PathVariable("tid") Integer tid){
        return teacherService.findByTid(tid);
    }
    @GetMapping("pages/{page}")
    public List<Teacher> findByPage(@PathVariable("page")Integer page){
        return teacherService.findByPage(page).getRecords();
    }
}
