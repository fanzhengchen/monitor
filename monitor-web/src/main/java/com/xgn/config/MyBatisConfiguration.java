package com.xgn.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Date: 2018-07-12
 * Time: 3:14 PM
 *
 * @author: MarkFan
 * @since v1.0.0
 */
@Configuration
@MapperScan(value = "com.xgn.mapper",sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MyBatisConfiguration {
    @Autowired
    @Qualifier("masterDataSource")
    DataSource masterDataSource;



    @Bean(name = "masterSqlSessionFactory")
    public SqlSessionFactory masterSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(masterDataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mybatis-mapper/*.xml"));
        return sessionFactoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate masterSqlSessionTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(masterSqlSessionFactory());
        return template;
    }
}
