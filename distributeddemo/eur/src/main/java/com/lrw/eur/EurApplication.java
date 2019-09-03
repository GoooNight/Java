package com.lrw.eur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurApplication.class, args);
    }

}
