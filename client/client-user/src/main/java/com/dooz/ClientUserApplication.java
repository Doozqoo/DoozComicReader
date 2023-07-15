package com.dooz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientUserApplication.class, args);
    }
}
