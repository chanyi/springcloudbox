package com.simba.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置中心客户端
 * 通过服务端可以为多个客户端提供配置服务，为了不重启服务的情况下，修改配置文件
 * 可以将配置文件存储在本地，也可以将配置文件存储在git仓库
 *
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

  @Value("${server.port}")
  private String port;

//  @Value("${foo}")
//  private String foo;

  @RequestMapping("/test")
  public String test(){
//    return this.port+","+this.foo;
    return this.port+",";
  }
}
