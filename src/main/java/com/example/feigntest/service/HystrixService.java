package com.example.feigntest.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HystrixService {
    @HystrixCommand(commandKey = "A", fallbackMethod = "B", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "20"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000")
            // 10 초 동안 10번 호출 중 20% 실패시(2번 실패시) 10초간 fallback 메소드 호출
            // 단, 해당 메소드가 3초 안에 끝나지 않을시 fallback 메소드 호출
    })
    public String A(){
        return "A";
    }

    @HystrixCommand(commandKey = "A", fallbackMethod = "B", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"),
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "20"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000")
            // 10 초 동안 10번 호출 중 20% 실패시(2번 실패시) 10초간 fallback 메소드 호출
            // 단, 해당 메소드가 3초 안에 끝나지 않을시 fallback 메소드 호출
    })
    public String Atest(){
        try{
            Thread.sleep(4000);
        }catch (Exception e){
            log.info("### exception");
        }
        return "A";
    }

    public String B(){
        return "B";
    }

}
