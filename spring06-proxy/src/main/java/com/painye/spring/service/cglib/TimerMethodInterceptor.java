package com.painye.spring.service.cglib;
/**
 * @author pan
 * @date 2024/4/25 22:03
 */

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName : com.painye.spring.service.cglib.TimerMethodInterceptor
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 22:03
 */
public class TimerMethodInterceptor implements MethodInterceptor {

    /**
     * 增强方法
     *
     * @param o 目标对象
     * @param method 目标方法
     * @param objects 目标方法参数
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = methodProxy.invokeSuper(o, objects);
        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end - start));
        return result;
    }
}
