package com.simba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class StartZipkinServer {

  public static void main(String[] args) {
    SpringApplication.run(StartZipkinServer.class,args);
  }
}
