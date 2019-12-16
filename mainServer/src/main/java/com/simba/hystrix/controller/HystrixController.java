package com.simba.hystrix.controller;

import com.simba.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务熔断
 * 在不改变各个微服务调用顺序的情况下，针对错误情况进行预处理
 * 设计原则：
 * 		1、服务隔离机制
 * 		2、服务降级机制
 * 		3、熔断机制
 * 		4、提供实时监控和报警功能（需要结合spring boot actuator,
 * 					actuator通过hystrix-stream节点获取监控的请求数据，提供可视化的监控界面）
 * 		5、提供实时的配置修改功能
 * 		6、
 *
 * 	使用路径：http://127.0.0.1:8763/hystrix/查看可视化监控界面（输入地址http://127.0.0.1:8763/actuator/hystrix.stream）
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

	@Autowired
	private FeignService feignService;

	@ResponseBody
	@RequestMapping("test")
	public String test(){
		return feignService.testFeign();
	}

}
