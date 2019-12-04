package com.simba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.simba")
public class StartEurekaClient {

  public static void main(String[] args) {
    SpringApplication.run(StartEurekaClient.class,args);
  }
}
