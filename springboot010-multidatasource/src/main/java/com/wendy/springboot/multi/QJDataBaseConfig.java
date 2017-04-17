package com.wendy.springboot.multi;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
@Configuration
@MapperScan(value = "com.wendy.springboot.multi.datasource.qj.dao",sqlSessionFactoryRef = "qjSqlSessionFactory")
@EnableTransactionManagement
public class QJDataBaseConfig {

    @Bean(name = "qjDataSource")
    @ConfigurationProperties(prefix = "spring.qj.datasource")
    public DataSource qjDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "qjSqlSessionFactory")
    public SqlSessionFactory db2SqlSessionFactory(@Qualifier("qjDataSource") DataSource qjDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(qjDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mappers/qj/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "qjSqlSessionTemplate")
    public SqlSessionTemplate db2SqlSessionTemplate(SqlSessionFactory qjSqlSessionFactory) throws Exception {

        return new SqlSessionTemplate(qjSqlSessionFactory);
    }


}
