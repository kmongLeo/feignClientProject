package com.controller;

import com.service.ProviderCallFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FeignClientController {
    private final ProviderCallFeignClient providerCallFeignClient;

    @GetMapping("client")
    public ResponseEntity client(){
        System.out.println(providerCallFeignClient.callProvider());
        return ResponseEntity.ok().body(providerCallFeignClient.callProvider());
    }
}
