package com.lrw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @author:awei
 * @date:2019/8/26
 * @ver:1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String userName;
}
