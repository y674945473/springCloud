package org.cloud.thread.controller;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.cloud.thread.util.LockUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.serializer.BeanContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

@Controller
@RequestMapping(value="test")
public class RedisController {
	
//	@Resource
//	private RedisTemplate<String, Object> template;
//	
	private JedisCluster JedisCluster;
	@RequestMapping(value="test")
	public void test(){
//		BeanContext.getBean("jedisCluster");
//		//把权限和token存在redis
//		template.opsForSet().add(1 + "." + "test", 1);
//		template.expire(""+1, 20, TimeUnit.MINUTES);
		System.out.println("开始执行");
		Jedis jedis=new Jedis("127.0.0.1",6379);
		boolean tryGetDistributedLock = LockUtil.tryGetDistributedLock(jedis, "222", "222", 100000);
		if (tryGetDistributedLock) {
			System.out.println("执行完毕");
		}else{
			System.out.println("执行失败");
		}
	}
	
	public void test2(){
//		BeanContext.getBean("jedisCluster");
//		//把权限和token存在redis
//		template.opsForSet().add(1 + "." + "test", 1);
//		template.expire(""+1, 20, TimeUnit.MINUTES);
		System.out.println("开始执行");
		Jedis jedis=new Jedis("127.0.0.1",6379);
		boolean tryGetDistributedLock = LockUtil.releaseDistributedLock(jedis, "222", "222");
		if (tryGetDistributedLock) {
			System.out.println("执行完毕");
		}else{
			System.out.println("执行失败");
		}
	}

}
