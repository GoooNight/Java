package com.zjweu.zjspbmpb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("teacher")
public class Teacher implements Serializable {
    @TableId(value = "tid",type = IdType.AUTO)
    private Integer tid;
    @TableField(value = "tname")
    private String tname;
}
