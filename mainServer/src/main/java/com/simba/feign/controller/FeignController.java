package com.simba.feign.controller;

import com.netflix.discovery.converters.Auto;
import com.simba.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基于ribbon做了封装，使负载均衡更加简单
 * 申明式，模版化的web service客户端
 * spring cloud feign 整合了 ribbon和hystrix，具有可插拔，基于注解，负载均衡，服务熔断等优势功能
 */
@RestController
@RequestMapping("/feign")
public class FeignController{

	@Autowired
	private FeignService feignService;

	@ResponseBody
	@RequestMapping("/test")
	public String test(){
		return feignService.testFeign();
	}

}
