package com.wendy.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/5/19.
 */
@Configuration
@ConditionalOnClass(HelloService.class)
@EnableConfigurationProperties(HelloConfigureProperties.class)
public class HelloAutoConfigure {

    @Autowired
    HelloConfigureProperties helloConfigureProperties;



    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "spring.wendy.service",name = "enabled",havingValue = "true")
    HelloService helloService(){
        return new HelloService(this.helloConfigureProperties.getHello());
    }
}
