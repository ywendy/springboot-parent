package com.wendy.springboot.swagger.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
