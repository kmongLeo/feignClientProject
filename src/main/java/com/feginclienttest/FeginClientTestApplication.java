package com.feginclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 어노테이션 추가하기
@EnableFeignClients
/*
* json을 리턴하는 공용 API 활용
* https://api.androidhive.info/contacts/
* https://api.github.com/repos/OpenFeign/feign/contributors
* https://github.com/build99k/feign-api-test
*
* */
public class FeginClientTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginClientTestApplication.class, args);
    }
}
