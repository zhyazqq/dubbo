package com.example.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.example.provider.service.impl")
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class,args);
    }
}
