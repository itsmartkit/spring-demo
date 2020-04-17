package com.itsmartkit.spring.demo.beans.factory;

import com.itsmartkit.spring.demo.proxy.MapperProxy;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author cyj
 * @name MapperProxyFactoryBean
 * @description TODO
 * @date 2020/4/17 13:12
 * Version 1.0
 */
public class MapperProxyFactoryBean<T> implements FactoryBean<T> {

    private final Class<T> mapperInterface;

    public MapperProxyFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(),new Class[]{ mapperInterface }, new MapperProxy());
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}