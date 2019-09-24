package org.cloud.provider.dept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class DeptApplication 
{
	private static Logger logger = LoggerFactory.getLogger(DeptApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(DeptApplication.class,args);
    	logger.info("------dept测试服务启动成功------");
    }
}
