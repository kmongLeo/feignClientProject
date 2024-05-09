package com.controller;

import com.service.ExampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final ExampleClient exampleClient;


    @Autowired
    public MyController(ExampleClient exampleClient) {
        this.exampleClient = exampleClient;
    }

    @GetMapping("/data")
    public String getDataFromExternalService() {
        return exampleClient.getEndpointData();
    }
    @GetMapping(value = "provider")
    public String examProvider(){
        return "provider";
    }
}
