package com.zjweu.spc.controller;

import com.zjweu.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("all")
    public List<Teacher> findAll(){
        /*return restTemplate.getForObject("http://localhost:8090/all",List.class);*/
        return restTemplate.getForObject("http://zjweu-teacher-provider/all",List.class);
    }

    @GetMapping("say")
    public String say(){
        return restTemplate.getForObject("http://zjweu-teacher-providerdemo/say",String.class);
    }
}
