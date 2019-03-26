package com.example.dubbo.demo.web.service;

import com.example.dubbo.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoService
 * @Description: 消费者服务层
 * @author Jason Xu
 * @date 2019年3月26日
 */
@Service
public class DemoService {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoService.class);

	@Reference
	private DemoApi demoApi;

	public String sayHello(String name) {
		return demoApi.sayHello(name);
	}
}
