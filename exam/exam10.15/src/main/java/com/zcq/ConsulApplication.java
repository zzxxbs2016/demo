package com.zcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
        System.out.println(111);
    }
}
