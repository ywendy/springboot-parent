package com.wendy.springboot.multi.datasource.qj.dao;

import com.wendy.springboot.multi.datasource.qj.domain.Order;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public interface OrderMapper {

    public Order getOrderById(Integer orderId);

}
