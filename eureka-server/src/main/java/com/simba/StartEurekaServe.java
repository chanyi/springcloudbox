package com.simba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = "com.simba")
@EnableEurekaServer
public class StartEurekaServe {
  public static void main(String[] args) {
    SpringApplication.run(StartEurekaServe.class,args);
  }
}
