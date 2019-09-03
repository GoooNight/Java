package com.lrw.esdemo.mapper;

import com.lrw.esdemo.entity.Teacher;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @author:awei
 * @date:2019/9/3
 * @ver:1.0
 **/
@Component("teacherMapper")
public interface TeacherMapper extends ElasticsearchRepository<Teacher,Integer> {

    Teacher queryTeacherByEs(Integer id);

}
