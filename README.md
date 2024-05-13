


# feign-api-test

### Feign client Sample code
* https://vmpo.tistory.com/109
json을 리턴하는 공용 API 활용

* https://api.androidhive.info/contacts/
* https://api.github.com/repos/OpenFeign/feign/contributors
* test : http://localhost:8080/repos/octocat/hello-world/contributors
* test : http://localhost:8080/v1/github/OpenFeign/feign
---

### 환경
* jdk 1.8
* gradle
* spring-cloud-starter-openfeign


### 상세
1. annotation 활용 

   com/example/feightest/client/ADriveFeignClient


2. Builder 활용
   
   com/example/feightest2/client/GitHubClient


### Circuit Breaker

   참고 블로그 : https://twowinsh87.github.io/etc/2019/01/19/etc-springboot-circuitbreaker/