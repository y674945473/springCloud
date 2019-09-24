package org.cloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication 
{
	private static Logger logger = LoggerFactory.getLogger(ServiceApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceApplication.class, args);
        logger.info("----service服务启动成功-----");
    }
}
