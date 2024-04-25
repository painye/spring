package com.painye.spring.service.impl;
/**
 * @author pan
 * @date 2024/4/25 21:16
 */

import com.painye.spring.service.OrderService;

/**
 * @ClassName : com.painye.spring.service.impl.OrderServiceImpl
 * @Description : 订单服务
 * @author pan
 * @date 2024/4/25 21:16
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void generate() {
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已生成");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(2541);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单信息如下：******");
    }

    @Override
    public void modify() {
        try {
            Thread.sleep(1010);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改");
    }
}
