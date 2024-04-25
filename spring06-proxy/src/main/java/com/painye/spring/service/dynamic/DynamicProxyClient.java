package com.painye.spring.service.dynamic;
/**
 * @author pan
 * @date 2024/4/25 21:32
 */

import com.painye.spring.service.OrderService;
import com.painye.spring.service.impl.OrderServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @ClassName : com.painye.spring.service.dynamic.DynamicProxyClient
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 21:32
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        //第一步：创建目标对象
        OrderService target = new OrderServiceImpl();
        /**
         * 第二步：创建代理对象
         *      1、在内存中生成代理类的字节码
         *      2、创建代理对象
         * newProxyInstance参数
         *     parameter1:目标对象的类加载器：将字节码加载到内存中
         *     parameter2: 接口。告诉JDK动态代理生成的类需要实现那些接口
         *     parameter3: 调用处理器。这是一个JDK动态代理规定的接口，接口全名java.lang.reflect.InvocationHandler。显然这是一个
         *                  回调接口，也就是说这个接口中方法的程序已经写好，就差这个接口的实现类。
         */
        OrderService orderServiceProxy =(OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));

        orderServiceProxy.generate();
        orderServiceProxy.detail();
        orderServiceProxy.modify();
    }
}
