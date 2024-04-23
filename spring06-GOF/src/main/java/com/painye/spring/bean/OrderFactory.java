package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/23 8:31
 */

/**
 * @ClassName : com.painye.spring.bean.OrderFactory
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 8:31
 */
public class OrderFactory {

    public Order newInstance() {
        return new Order();
    }
}
