package org.cloud.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
/**
 * 
 * @author yhx
 *
 */

@Configuration
public class FeignClientConfig {
	
	@Bean
    public Logger.Level getFeignLoggerLevel() {
        return feign.Logger.Level.FULL ;
    }
	@Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("studyjava", "hello");
    }
}
