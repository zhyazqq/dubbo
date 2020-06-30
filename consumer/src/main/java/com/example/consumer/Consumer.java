package com.example.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.example.consumer.controller")
public class Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Consumer.class,args);
    }
}
