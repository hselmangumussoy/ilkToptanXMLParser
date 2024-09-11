package com.hsgumussoy.testforilktoptan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TestforilktoptanApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestforilktoptanApplication.class, args);
    }

}
