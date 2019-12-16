package com.simba.zipkin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一个采集并跟踪微服务的组件
 * 可以通过界面监控到请求在各个微服务上所耗费的时间
 * 包括客户端和服务端
 */
@RestController
@RequestMapping("/zipkin")
public class ZipKinController {

  @Value("${server.port}")
  private String port;

  @GetMapping("/index")
  public String index(){
    return this.port;
  }
}
