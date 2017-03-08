package com.wendy.springboot.configure.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tony.
 */
@Component
public class ProjectProperties {
    @Value("${com.wendy.blog.name}")
    private String name;
    @Value("${com.wendy.blog.title}")
    private String title;
    @Value("${com.wendy.blog.desc}")
    private String desc;
    @Value("${com.wendy.blog.value}")
    private String value;
    @Value("${com.wendy.blog.number}")
    private Integer number;
    @Value("${com.wendy.blog.bigNumber}")
    private Long bigNumber;
    @Value("${com.wendy.blog.test1}")
    private Integer test1;
    @Value("${com.wendy.blog.test2}")
    private Integer test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBigNumber() {
        return bigNumber;
    }

    public void setBigNumber(Long bigNumber) {
        this.bigNumber = bigNumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "ProjectProperties{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", value='" + value + '\'' +
                ", number=" + number +
                ", bigNumber=" + bigNumber +
                ", test1=" + test1 +
                ", test2=" + test2 +
                '}';
    }
}
