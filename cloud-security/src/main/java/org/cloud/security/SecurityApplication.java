package org.cloud.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SecurityApplication 

{
	
	private static Logger logger = LoggerFactory.getLogger(SecurityApplication.class);
    public static void main( String[] args )
    {
        SpringApplication.run(SecurityApplication.class, args);
        logger.info("-------安全设置启动成功----------");
        
    }
}
