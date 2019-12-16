package com.simba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @Value("${server.port}")
  private String port;

  @GetMapping("/test")
  public String test(){
    return "eureka-client";
  }

  @ResponseBody
  @GetMapping("/index")
  public String index(){
    return "port:"+this.port;
  }
}
