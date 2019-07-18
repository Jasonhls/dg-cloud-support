package com.dg.mall.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DgSpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DgSpringBootAdminApplication.class, args);
    }

}
