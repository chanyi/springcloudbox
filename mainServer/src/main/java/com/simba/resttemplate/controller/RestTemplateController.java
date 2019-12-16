package com.simba.resttemplate.controller;

import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
@Controller
@RequestMapping("/restTemplate")
public class RestTemplateController {
  //提供get post put delete方式
  @Autowired
  private RestTemplate restTemplate;

  @ResponseBody
  @RequestMapping("/testRestTemplate")
  @Test
  public void testRestTemplate(){
//    String url = "http://127.0.0.1:8762/test/test";
    String url = "http://eurekaclient/test/test";
//    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> list =  restTemplate.getForEntity(url, String.class);
    System.out.println(list);
    System.out.println(list.getBody());
  }

  @ResponseBody
  @RequestMapping("/testRestTemplate1")
  public void test(){
    String url = "http://127.0.0.1:8762/test/test";
    ResponseEntity<String> list =  restTemplate.getForEntity(url, String.class);
    System.out.println(list);
    System.out.println(list.getBody());
  }
}
