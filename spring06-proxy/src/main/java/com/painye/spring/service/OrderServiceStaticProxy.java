package com.painye.spring.service;
/**
 * @author pan
 * @date 2024/4/25 21:19
 */

/**
 * @ClassName : com.painye.spring.service.OrderServiceStaticProxy
 * @Description : 使用静态代理来增加对任务耗时的功能
 * @author pan
 * @date 2024/4/25 21:19
 */
public class OrderServiceStaticProxy implements OrderService {

    private OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"ms");

    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        orderService.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"ms");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        orderService.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"ms");
    }
}
