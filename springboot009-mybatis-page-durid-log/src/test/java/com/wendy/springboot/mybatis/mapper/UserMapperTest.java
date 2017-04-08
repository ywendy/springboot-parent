package com.wendy.springboot.mybatis.mapper;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wendy.springboot.mybatis.MyBatisApplication;
import com.wendy.springboot.mybatis.entry.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyBatisApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectById() throws Exception {

        assertNotNull(userMapper);
        User user = userMapper.selectById(3L);
        System.out.println(user);

    }

    @Test
    public void list(){
        PageHelper.startPage(1,5);
        List<User> list = userMapper.list();
        PageInfo page = new PageInfo(list);
        System.out.println(JSON.toJSON(page));
    }

}