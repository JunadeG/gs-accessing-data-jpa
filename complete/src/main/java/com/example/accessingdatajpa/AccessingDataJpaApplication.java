package com.example.accessingdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

// Add the (scanBasePackages = "...") part
@SpringBootApplication(scanBasePackages = "com.example.accessingdatajpa")
public class AccessingDataJpaApplication {

    public static void main(String[] args) {
        // You can remove the debugging code now if you like, or leave it.
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }
}