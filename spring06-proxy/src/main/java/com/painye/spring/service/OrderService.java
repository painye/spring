package com.painye.spring.service;

/**
 * 订单接口
 *
 * @author pan
 * @date 2024/4/25 21:13
 */
public interface OrderService {

    /**
     * 生成订单
     */
    void generate();

    /**
     * 订单详情
     */
    void detail();

    /**
     * 修改订单
     */
    void modify();

}
