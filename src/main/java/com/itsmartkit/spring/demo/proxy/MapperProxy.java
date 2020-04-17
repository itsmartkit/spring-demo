package com.itsmartkit.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author cyj
 * @name MapperProxy
 * @description TODO
 * @date 2020/4/17 13:05
 * Version 1.0
 */
@Slf4j
public class MapperProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("invoke: {} method:{} args:{}", method.getDeclaringClass(), method.getName(), Arrays.toString(args));
        return null;
    }
}