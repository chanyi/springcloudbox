package com.simba.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/eureka")
public class EurekaController {

  @RequestMapping("/home")
  public String home() {
    return "Hello World";
  }
}
