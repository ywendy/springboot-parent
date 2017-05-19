package com.wendy.springboot;

/**
 * Created by Administrator on 2017/5/19.
 */
public class HelloService {

    private String hello;

    public HelloService(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }
}
