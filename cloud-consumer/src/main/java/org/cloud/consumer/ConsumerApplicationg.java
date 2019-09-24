package org.cloud.consumer;

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
public class ConsumerApplicationg 
{
	private static Logger Logger = LoggerFactory.getLogger(ConsumerApplicationg.class);
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApplicationg.class, args);
        Logger.info("------consumer服务启动成功--------");
        
    }
}
