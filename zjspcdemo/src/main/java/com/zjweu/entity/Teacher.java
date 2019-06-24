package com.zjweu.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {

    @TableId
    private Integer tid;
    private String tname;
}
