package com.lrw.provider.service.impl;

import com.lrw.provider.mapper.UserMapper;
import config.util.FormatMapDemo;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;


import java.util.List;
import java.util.Map;

/**
 * @Description
 * @author:awei
 * @date:2019/9/2
 * @ver:1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> allUser(Integer page, Integer limit) {
        return userMapper.allUser(page,limit);
    }

    @Override
    public List<Map<String,Object>> allTeacher(){
        List<Map<String,Object>> list = userMapper.allTeacher();
        List list1 = FormatMapDemo.formatMap(list);
        return list1;
    }
}
