package com.dailywear.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.pool.DruidDataSource;
import com.dailywear.configuration.DynamicDataSource;
import com.dailywear.entity.User;
import com.dailywear.service.IUserService;

@RestController
public class TestController {
	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping("/test")
	public String test() {
		DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/cas?characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&useAffectedRows=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        DynamicDataSource.dataSourcesMap.put("defaultDataSource", druidDataSource);
        DynamicDataSource.setDataSource("defaultDataSource");
		return "aaaa";
	}
	
	@RequestMapping("/queryUserData")
	public List<User> queryUserData() {
		return userServiceImpl.queryUserData();
	}
}
