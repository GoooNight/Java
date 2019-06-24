package com.zjweu.spc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherService {

    @GetMapping("say")
    public String sayHello(){

        return "Hello!";
    }
}
