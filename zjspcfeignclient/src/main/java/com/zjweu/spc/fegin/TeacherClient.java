package com.zjweu.spc.fegin;

import com.zjweu.entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("zjweu-teacher-provider")
public interface TeacherClient {

    @RequestMapping(value = "all",method = RequestMethod.GET)
    List<Teacher> findAll();
}
