package com.example.providerdemo;


import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
public class ProviderdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderdemoApplication.class, args);
    }



}
