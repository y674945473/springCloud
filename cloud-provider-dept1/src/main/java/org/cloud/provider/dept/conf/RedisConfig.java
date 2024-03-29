//package org.cloud.provider.dept.conf;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
//
//@Configuration
//@ConditionalOnClass(RedisOperations.class)
//@EnableConfigurationProperties(RedisProperties.class)
//public class RedisConfig {
//	
//	@Bean(name="redisTemplate")
//	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//	   
//		RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
//	    //使用fastjson序列化
//		FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
//		// value值的序列化采用fastJsonRedisSerializer
//		template.setValueSerializer(fastJsonRedisSerializer);
//		template.setHashValueSerializer(fastJsonRedisSerializer);
//		// key的序列化采用StringRedisSerializer
//		template.setKeySerializer(new StringRedisSerializer());
//		template.setHashKeySerializer(new StringRedisSerializer());
//		template.setConnectionFactory(redisConnectionFactory);
//		return template;
//	}
//    
//	@Bean(name="stringRedisTemplate")
//	public StringRedisTemplate stringRedisTemplate(
//	    RedisConnectionFactory redisConnectionFactory) {
//	    StringRedisTemplate template = new StringRedisTemplate();
//	    template.setConnectionFactory(redisConnectionFactory);
//	    return template;
//	}
//}
