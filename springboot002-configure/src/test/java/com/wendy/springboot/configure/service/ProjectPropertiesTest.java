package com.wendy.springboot.configure.service;

import com.wendy.springboot.configure.ConfigureApplication;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tony.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ConfigureApplication.class)
public class ProjectPropertiesTest {

    private static final Log LOG = LogFactory.getLog(ProjectPropertiesTest.class);
    @Autowired
    private ProjectProperties projectProperties;

    @Test
    public void testProperties(){
        LOG.info(projectProperties);
    }


}