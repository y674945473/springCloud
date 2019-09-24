package org.zuul.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Hello world!
 *
 */
@EnableZuulServer
@SpringBootApplication
@EnableEurekaClient
public class ZuulApplication 
{
	private static Logger logger = LoggerFactory.getLogger(ZuulApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(ZuulApplication.class, args);
    	logger.info("-------------zuul网关服务启动成功---------------");
    }
}
