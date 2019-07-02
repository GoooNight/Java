package com.zjweu.zjspbmpb.controller;

import com.zjweu.zjspbmpb.Service.TeacherService;
import com.zjweu.zjspbmpb.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TlTeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("tlall")
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
