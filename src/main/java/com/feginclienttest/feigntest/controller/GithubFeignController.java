package com.feginclienttest.feigntest.controller;

import java.util.List;

import com.feginclienttest.feigntest.dto.Contributor;
import com.feginclienttest.feigntest.service.GithubFeignService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GithubFeignController {
    private final GithubFeignService getContributor;

    @GetMapping(value = "/v1/github/{owner}/{repo}")
    public List<Contributor> getGitHubContributors(@PathVariable String owner , @PathVariable String repo){
        return getContributor.getContributor(owner,repo);
    }
}
