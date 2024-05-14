package com.yufei.kernel;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;

import com.yufei.proxy.YuFeiMapperProxy;

/**
 * @author shijianlong
 * @date 2024/5/13
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public MapperFactoryBean(){

    }

    @Override
    public T getObject() throws Exception {
        YuFeiMapperProxy<T> yuFeiMapperProxy = new YuFeiMapperProxy<>();

        // 创建代理
        T t = (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[]{mapperInterface}, yuFeiMapperProxy);

        return t;
    }

    @Override
    public Class<?> getObjectType() {
        return this.mapperInterface;
    }
}
