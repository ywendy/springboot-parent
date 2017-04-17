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
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
@Configuration
@MapperScan(value = "com.wendy.springboot.multi.datasource.pj.dao",sqlSessionFactoryRef = "pjSqlSessionFactory")
@EnableTransactionManagement
public class PJDataBaseConfig {

    @Bean(name = "pjDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.pj.datasource")
    public DataSource pjDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "pjSqlSessionFactory")
    @Primary
    public SqlSessionFactory db1SqlSessionFactory(@Qualifier("pjDataSource") DataSource pjDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(pjDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mappers/pj/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "pjSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate pjSqlSessionTemplate(SqlSessionFactory pjSqlSessionFactory) throws Exception {

        return new SqlSessionTemplate(pjSqlSessionFactory);
    }



}
