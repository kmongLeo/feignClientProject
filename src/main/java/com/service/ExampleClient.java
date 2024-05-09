package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "example", url = "https://api.example.com")
public interface ExampleClient {
    @GetMapping("/data")
    String getEndpointData();
}
