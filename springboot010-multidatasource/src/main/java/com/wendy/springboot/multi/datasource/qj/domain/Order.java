package com.wendy.springboot.multi.datasource.qj.domain;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class Order {
    private Integer id;
    private String productName;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
