package com.dooz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan(basePackages = {"com.dooz.mapper"})
public class ClientComicApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientComicApplication.class, args);
    }
}
