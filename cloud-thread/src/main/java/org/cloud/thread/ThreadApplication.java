package org.cloud.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ThreadApplication 
{
	private static Logger logger = LoggerFactory.getLogger(ThreadApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(ThreadApplication.class, args);
    	logger.info("-----测试服务多线程启动成功------------");
        System.out.println( "Hello World!" );
    }
}
