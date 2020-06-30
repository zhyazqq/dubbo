package com.example.consumer.controller;

import com.example.provider.service.IDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Reference(version = "1.0.0")
    private IDemoService service;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String demo(){
        service.justDoIt();
        return "success";
    }
}
