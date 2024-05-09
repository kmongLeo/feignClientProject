package com.feginclienttest;

import com.service.ExampleClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@EnableFeignClients
class FeginClientTestApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExampleClient exampleClient;

    @Test
    public void testEndpoint() throws Exception{
        // 외부 API 응답 모의 설정
        String mockResponse = "Mock..";
        when(exampleClient.getEndpointData()).thenReturn(mockResponse);
        // 외부 API로의 요청 테스트
        mockMvc.perform(get("/data"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().string(mockResponse));

    }

    @Test
    void contextLoads() {
    }

}
