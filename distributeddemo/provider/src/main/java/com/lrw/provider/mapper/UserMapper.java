package com.lrw.provider.mapper;

import com.lrw.provider.mapper.sqlstatement.UserSql;
import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @author:awei
 * @date:2019/9/2
 * @ver:1.0
 **/
@Mapper
public interface UserMapper {

    @SelectProvider(type = UserSql.class,method = "addUser")
    List<User> allUser(@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from teacher")
    List<Map<String,Object>> allTeacher();
}
