package com.zjweu.smddemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjweu.entity.Teacher;
import com.zjweu.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TeacherController {

    @Reference(version = "1.0.0")
    private TeacherService teacherService;


    @GetMapping("teacher")
    @ResponseBody
    public List<Teacher> finc(){
        List<Teacher> list = teacherService.findAll();
        return list;
    }

    @GetMapping("all")
    public ModelAndView fincAll(){
        List<Teacher> list = teacherService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("list",list);
        mav.setViewName("allteacher");
        return mav;
    }

    @RequestMapping("save")
    @ResponseBody
    public String save(Teacher teacher){
        System.out.println(teacher);
        boolean b = teacherService.save(teacher);
        if (b){
            return "成功";
        }else {
            return "失败";
        }
    }
    @RequestMapping("update")
    @ResponseBody
    public String update(Teacher teacher){
        System.out.println(teacher);
        boolean b = teacherService.update(teacher);
        if (b){
            return "成功";
        }else {
            return "失败";
        }
    }
    @RequestMapping("delete")
    @ResponseBody
    public String delete(Integer tid){
        boolean b = teacherService.delete(tid);
        if (b){
            return "成功";
        }else {
            return "失败";
        }
    }
}
