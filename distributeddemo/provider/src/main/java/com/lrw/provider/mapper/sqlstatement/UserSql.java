package com.lrw.provider.mapper.sqlstatement;


import org.apache.ibatis.jdbc.SQL;

/**
 * @Description
 * @author:awei
 * @date:2019/9/2
 * @ver:1.0
 **/
public class UserSql {
    public String addUser(Integer page,Integer limit){
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("user limit "+(page-1)*limit+","+limit);
        /*sql.FROM("user");*/
        System.out.println(sql.toString());
        return sql.toString();
    }
}
