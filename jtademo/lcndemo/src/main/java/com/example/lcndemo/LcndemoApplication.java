package com.example.lcndemo;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagerServer
public class LcndemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcndemoApplication.class, args);
    }

}
