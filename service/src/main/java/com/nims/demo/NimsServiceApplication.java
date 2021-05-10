package com.nims.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/service-integration-config.xml")
public class NimsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NimsServiceApplication.class, args);
    }
}
