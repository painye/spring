package com.painye.spring.service;
/**
 * @author pan
 * @date 2024/4/25 21:23
 */

import com.painye.spring.service.impl.OrderServiceImpl;

/**
 * @ClassName : com.painye.spring.service.StaticProxyClient
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 21:23
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        OrderService target = new OrderServiceImpl();
        OrderServiceStaticProxy orderProxy = new OrderServiceStaticProxy(target);
        orderProxy.generate();
        orderProxy.detail();
        orderProxy.modify();

    }
}
