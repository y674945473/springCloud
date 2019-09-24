package org.cloud.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"org.cloud.service"})//进行接口IDeptClientService的扫描生成使得可以注入到ConsumerDeptController里面
public class ConsumerApplicationg 
{
	private static Logger Logger = LoggerFactory.getLogger(ConsumerApplicationg.class);
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApplicationg.class, args);
        Logger.info("------consumer服务启动成功--------");
        
    }
}
