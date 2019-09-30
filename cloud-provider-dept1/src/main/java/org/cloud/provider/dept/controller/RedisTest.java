package org.cloud.provider.dept.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="test")
public class RedisTest {
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate; 
	
	
	@RequestMapping(value="ceshi")
	public void test(){
		redisTemplate.opsForSet().add("test", "测试");
		redisTemplate.expire("test", 20, TimeUnit.MINUTES);
	}
}
