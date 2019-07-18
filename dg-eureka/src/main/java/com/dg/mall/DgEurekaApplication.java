package com.dg.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DgEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DgEurekaApplication.class, args);
    }

}
