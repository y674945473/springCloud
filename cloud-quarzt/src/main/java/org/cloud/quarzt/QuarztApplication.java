package org.cloud.quarzt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableScheduling //开启定时注解
public class QuarztApplication 
{
	private static Logger logger = LoggerFactory.getLogger(QuarztApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(QuarztApplication.class, args);
        logger.info("-------------自动任务服务启动成功--------");
        
    }
}
