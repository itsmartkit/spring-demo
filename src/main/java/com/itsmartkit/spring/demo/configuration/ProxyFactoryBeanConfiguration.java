package com.itsmartkit.spring.demo.configuration;

import com.itsmartkit.spring.demo.beans.factory.MapperProxyFactoryBean;
import com.itsmartkit.spring.demo.mapper.StudentMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cyj
 * @name ProxyFactoryBeanConfiguration
 * @description TODO
 * @date 2020/4/17 13:23
 * Version 1.0
 */
@Configuration
public class ProxyFactoryBeanConfiguration {

    @Bean(name = "studentMapper")
    public MapperProxyFactoryBean proxyFactoryBean() throws Exception {
        return new MapperProxyFactoryBean(StudentMapper.class);
    }

}