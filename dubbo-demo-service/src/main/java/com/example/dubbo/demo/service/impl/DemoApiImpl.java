package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.Service;

/**
 * 
 * @ClassName: DemoApiImpl
 * @Description: DemoApi接口实现
 * @author Jason Xu
 * @date 2019年3月26日
 */
@Service
public class DemoApiImpl implements DemoApi {
    /**
     * 实现 sayHello 接口
     * @param name
     * @return String
     */
	@Override
	public String sayHello(String name) {
		return "Hello, " + name + " (from Spring Boot with dubbo)";
	}
}
