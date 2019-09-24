package org.cloud.provider.dept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan("org.cloud.provider.dept.service")
@EnableCircuitBreaker
public class DeptApplication 
{
	private static Logger logger = LoggerFactory.getLogger(DeptApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(DeptApplication.class,args);
    	logger.info("------hystrix测试服务启动成功------");
    }
}
