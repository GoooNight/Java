package com.example.consumerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
@RestController
public class SayHello {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("say")
    public String sayHello(){
        String template = restTemplate.getForObject("http://zjweu-teacher-provider/say", String.class);
        return template;
    }

    @GetMapping("all")
    public List all(){
        List list = restTemplate.getForObject("http://zjweu-teacher-provider/allUser", List.class);
        List list1 = restTemplate.getForObject("http://zjweu-teacher-provider/allTeacher", List.class);
        ArrayList<List> list2 = new ArrayList<>(2);
        list2.add(list);
        list2.add(list1);
        return list2;
    }
    @GetMapping("add")
    public String add() {
        String s = restTemplate.getForObject("http://zjweu-teacher-provider/addUser", String.class);
        String s1 = restTemplate.getForObject("http://zjweu-teacher-provider/saveTeacher", String.class);
        return s+"----------"+s1;
    }
}
