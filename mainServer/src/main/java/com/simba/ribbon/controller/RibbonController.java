package com.simba.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * 一个通用的http客户端工具
 * 实现内部的负载均衡
 *
 * 具体实现通过注解@LoadBalanced，
 * 加在RestTemplate的bean上，所有通过restTemplate调用微服务的过程就都会实现负载均衡
 */
@Controller
@RequestMapping("/ribbon")
public class RibbonController {

	@Autowired
	private RestTemplate restTemplate;

	@ResponseBody
	@GetMapping("/test")
	public String test(){

		String url = "http://EUREKACLIENT/test/index";
		String str = restTemplate.getForEntity(url,String.class).getBody();
		return str;

	}
}
