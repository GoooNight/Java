package com.example.feigndemo.dao;

import com.lrw.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @author:awei
 * @date:2019/8/28
 * @ver:1.0
 **/
@Mapper
public interface userDAO {

    @Select("select * from user")
    List<User> allUser();

    @Insert("insert into user(username) values(#{userName})")
    int addUser(User user);
}
