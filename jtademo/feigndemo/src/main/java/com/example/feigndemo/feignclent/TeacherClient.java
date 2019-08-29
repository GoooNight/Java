package com.example.feigndemo.feignclent;

import com.lrw.entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/27
 * @ver:1.0
 **/
@FeignClient("zjweu-teacher-provider")
public interface TeacherClient {


    @RequestMapping(value = "allTeacher",method = RequestMethod.GET)
    List<Teacher> allTeacher();

    @GetMapping(value = "saveTeacher")
    String saveTeacher();

}
