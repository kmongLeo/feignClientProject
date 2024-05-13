package com.example.feigntest.controller;

import com.example.feigntest.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    public HystrixService hystrixService;

    @RequestMapping(value = "/Atest")
    public String test1(){
        return hystrixService.A();
    }

    @RequestMapping(value = "/Atest2")
    public String test2(){
        return hystrixService.Atest();
    }
}
