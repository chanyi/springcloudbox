package com.simba.feign.service;

import com.simba.feign.service.impl.FeignErrorServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "EUREKACLIENT",fallback = FeignErrorServiceImpl.class)
public interface FeignService {
	@GetMapping("/test/test")
	String testFeign();
}
