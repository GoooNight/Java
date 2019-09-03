package com.lrw.esdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * @Description Document注解用来配置es，indexName最好为项目名称，type最好为类名
 * @author:awei
 * @date:2019/9/3
 * @ver:1.0
 **/
@Data
@Document(indexName = "distributeddemo",type = "teacher",indexStoreType="fs",shards=5,replicas=1,refreshInterval="-1")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {

    @Id
    private Integer tid;
    @Field
    private String tname;

    private String es;
}
