package com.feginclienttest.feigntest.service;


import java.util.List;

import com.feginclienttest.feigntest.client.GitHubFeignClient;
import com.feginclienttest.feigntest.dto.Contributor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GithubFeignService {
    @Autowired
    private GitHubFeignClient getContributor;

    public List<Contributor> getContributor(String owner, String repo) {
        List<Contributor> contributors = getContributor.getContributor(owner, repo);
        return contributors;
    }
}
