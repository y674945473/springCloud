package org.cloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication 
{
	private static Logger logger = LoggerFactory.getLogger(EurekaApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaApplication.class, args);
        logger.info("------eureka注册中心1启动成功-------");
    }
    
    /**
     * 
     * ---
spring:
  profiles: dev-9012
  application:
    name: microcloud-eureka-7002
server:
  port: 9012
eureka: 
  instance: # eureak实例定义
    hostname: eureka-7002.com # 定义Eureka实例所在的主机名称
  client: # 客户端进行Eureka注册的配置
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://eureka-7003.com:9013/eureka,http://eureka-7001.com:9011/eureka
      
---
spring:
  profiles: dev-9013
  application:
    name: microcloud-eureka-7003
server:
  port: 9013
eureka: 
  instance: # eureak实例定义
    hostname: eureka-7003.com # 定义Eureka实例所在的主机名称
  client: # 客户端进行Eureka注册的配置
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://eureka-7001.com:9011/eureka,http://eureka-7002.com:9012/eureka
     * */
}
