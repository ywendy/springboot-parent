package com.wendy.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2017/5/19.
 */
@ConfigurationProperties("spring.wendy.service")
public class HelloConfigureProperties {


    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
