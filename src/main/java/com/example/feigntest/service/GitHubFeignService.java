package com.example.feigntest.service;

import com.example.feigntest.client.GitHubFeignClient;
import com.example.feigntest.dto.Contributor;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GitHubFeignService {

  private final GitHubFeignClient gitHubFeignClient;

  public List<Contributor> getContributor(String owner, String repo) {
    List<Contributor> contributors = gitHubFeignClient.getContributor(owner, repo);
    return contributors;
  }
}
