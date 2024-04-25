package com.painye.spring.service.dynamic;
/**
 * @author pan
 * @date 2024/4/25 21:40
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName : com.painye.spring.service.dynamic.TimerInvocationHandler
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 21:40
 */
public class TimerInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 需要代理的方法
     * @param args 代理方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object val = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-start)+"ms");
        return val;
    }
}
