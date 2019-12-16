package com.simba;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.simba")
@RestController
@EnableZuulProxy
@EnableFeignClients//开启feign
@EnableCircuitBreaker//申明启用数据监控
@EnableHystrixDashboard//开启可视化数据监控界面
@EnableConfigServer//开启配置中心
public class StartSpringCloudBox {

  public static void main(String[] args) {
    SpringApplication.run(StartSpringCloudBox.class, args);
  }

  @Bean
  @LoadBalanced//启用ribbon实现负载均衡，默认使用轮询方式
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

  /**
   * 加了这部分，才可以访问路径http://127.0.0.1:8763/actuator/hystrix.stream
   * @return
   */
  @Bean
  public ServletRegistrationBean getServlet(){

    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();

    ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);

    registrationBean.setLoadOnStartup(1);

    registrationBean.addUrlMappings("/actuator/hystrix.stream");

    registrationBean.setName("HystrixMetricsStreamServlet");


    return registrationBean;
  }

}