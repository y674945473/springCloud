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
        logger.info("------eureka注册中心3启动成功-------");
    }
}
