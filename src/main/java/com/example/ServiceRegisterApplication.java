package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//pour activer le service d'enregistrement
@SpringBootApplication
public class ServiceRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegisterApplication.class, args);
    }

}
