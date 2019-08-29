package com.example.feigndemo.service.impl;

import com.example.feigndemo.dao.userDAO;
import com.lrw.entity.User;
import com.lrw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/28
 * @ver:1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private com.example.feigndemo.dao.userDAO userDAO;

    @Override
    public List<User> allUser() {
        return userDAO.allUser();
    }

    @Override
    public int save(User user) {
        return userDAO.addUser(user);
    }
}
