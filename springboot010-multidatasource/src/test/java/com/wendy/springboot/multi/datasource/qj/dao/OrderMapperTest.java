package com.wendy.springboot.multi.datasource.qj.dao;

import com.wendy.springboot.multi.APP;
import com.wendy.springboot.multi.datasource.pj.dao.UserMapper;
import com.wendy.springboot.multi.datasource.pj.domain.User;
import com.wendy.springboot.multi.datasource.qj.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = APP.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getOrderById() throws Exception {

        Order order = orderMapper.getOrderById(1);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        System.out.println(order);
    }

}