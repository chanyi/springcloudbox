package com.simba.zuul.controller;

/**
 * 实现客户端对服务器的访问控制，
 * 所有的请求到网关这里，然后再由网关指定到某个微服务
 * 使用配置文件中的：zuul.routes.eureka-client=/eureka/**
 * 如访问127.0.0.1:8763/eureka/test/test,就通过网关将地址转为127.0.0.1:8762/test/test
 * 默认使用的负载均衡是轮询访问
 */
public class ZuulController {
}
