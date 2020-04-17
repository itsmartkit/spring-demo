package com.itsmartkit.spring;

import com.itsmartkit.spring.demo.SpringDemoApplication;
import com.itsmartkit.spring.demo.beans.factory.MapperProxyFactoryBean;
import com.itsmartkit.spring.demo.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringDemoApplication.class)
@Slf4j
class SpringDemoApplicationTests {

    @Resource
    private StudentMapper studentMapper;

    @Resource(name = "&studentMapper")
    private MapperProxyFactoryBean factoryBean;

    @Test
    void testStudentMapper() {
        studentMapper.UpdateById(1,"张三");
        log.info("objectType: {}", factoryBean.getObjectType());
        log.info("factoryBeanType: {}", factoryBean.getClass());
    }

}
