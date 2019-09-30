package org.cloud.thread.util;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.cloud.thread.service.TestService;
import org.springframework.data.redis.core.RedisTemplate;

public class ThreadUtil implements Runnable {

	@Resource
	private RedisTemplate<String, Object> redisTemplate; 
	
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println("线程："+i);
			TestService test = new TestService();
		}
	}
	
	
	public Runnable test(final int i){
		return new Runnable() {
			
			public void run() {
				System.out.println("线程："+i);
				//把权限和token存在redis
				redisTemplate.opsForSet().add(i + "." + "test", i);
				redisTemplate.expire(""+i, 20, TimeUnit.MINUTES);
				TestService test = new TestService();
			}
		};
	}
}
