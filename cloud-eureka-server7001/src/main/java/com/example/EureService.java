package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shkstart
 * @create 2020-11-03 15:52
 */
@SpringBootApplication
@EnableEurekaServer
public class EureService {
    public static void main(String[] args) {
        SpringApplication.run(EureService.class,args);
    }
}
