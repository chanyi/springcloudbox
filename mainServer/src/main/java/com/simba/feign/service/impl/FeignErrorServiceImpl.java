package com.simba.feign.service.impl;

import com.simba.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignErrorServiceImpl implements FeignService {
	@Override
	public String testFeign() {
		return "调用testFeign报错，执行服务降级处理";
	}
}
