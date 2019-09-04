package com.lrw.gatewaydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @author:awei
 * @date:2019/9/4
 * @ver:1.0
 **/
@RestController
public class GateController {


    @RequestMapping("fallback")
    public String fallBack(){
        return "fail";
    }
}
