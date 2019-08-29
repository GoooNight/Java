package com.lrw.service;

import com.lrw.entity.User;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
public interface UserService {

    List<User> allUser();

    int save(User user);

}
