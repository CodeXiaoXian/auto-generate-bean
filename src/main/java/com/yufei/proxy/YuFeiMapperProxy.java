package com.yufei.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.yufei.kernel.BaseYuFeiMapperImpl;

/**
 * @author shijianlong
 * @date 2024/5/13
 */
public class YuFeiMapperProxy<T> implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        BaseYuFeiMapperImpl<T> baseYuFeiMapper = new BaseYuFeiMapperImpl<>();
        return method.invoke(baseYuFeiMapper, args);
    }
}
