package com.nims.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/web-integration-config.xml")
public class NimsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NimsWebApplication.class, args);
    }
}
