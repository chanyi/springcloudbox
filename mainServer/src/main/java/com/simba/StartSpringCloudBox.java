package com.simba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.simba")
@RestController
public class StartSpringCloudBox {

  public static void main(String[] args) {
    SpringApplication.run(StartSpringCloudBox.class, args);
  }

  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

}