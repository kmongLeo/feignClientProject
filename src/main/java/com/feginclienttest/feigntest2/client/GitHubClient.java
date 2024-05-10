package com.feginclienttest.feigntest2.client;

import com.feginclienttest.feigntest.dto.Contributor;
import com.feginclienttest.feigntest2.dto.Issue;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface GitHubClient {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

    @RequestLine("GET /repos/{owner}/{repo}/issues")
    List<Issue> getIssues(@Param("owner") String owner, @Param("repo") String repo);

}
