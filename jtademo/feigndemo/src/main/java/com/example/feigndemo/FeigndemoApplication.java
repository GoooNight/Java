package com.example.feigndemo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDistributedTransaction
public class FeigndemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeigndemoApplication.class, args);
    }

}
