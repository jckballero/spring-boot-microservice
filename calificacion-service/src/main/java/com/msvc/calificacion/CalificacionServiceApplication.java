package com.msvc.calificacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CalificacionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalificacionServiceApplication.class, args);
    }

}
