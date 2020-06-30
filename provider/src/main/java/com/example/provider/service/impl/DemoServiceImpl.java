package com.example.provider.service.impl;

import com.example.provider.service.IDemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class DemoServiceImpl implements IDemoService {
    @Override
    public void justDoIt() {
        System.out.println("success");
    }
}
