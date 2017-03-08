package com.wendy.springboot.mybatis.mapper;

import com.wendy.springboot.mybatis.MybatisApplication;
import com.wendy.springboot.mybatis.domain.Python;
import com.wendy.springboot.mybatis.domain.PythonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.transaction.SpringManagedTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tony.
 * @since 1.7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybatisApplication.class)
public class PythonMapperTest extends AbstractTransactionalJUnit4SpringContextTests{
    @Autowired
    private PythonMapper pythonMapper;
    @Test
    @Rollback(true)
    public void findByName() throws Exception {
        pythonMapper.insert("AAABC");
        Python u = pythonMapper.findByName("AAABC");
    }

    @Test
    public void insert() throws Exception {
        pythonMapper.insert("AAABC");
    }

}