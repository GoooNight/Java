package com.zjweu.zjspbmpb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ZjspbmpbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZjspbmpbApplication.class, args);
    }

}
