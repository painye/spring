package com.painye.spring6.service;
/**
 * @author pan
 * @date 2024/4/21 21:44
 */

import com.painye.spring6.dao.OrderDao;

/**
 * @ClassName : com.painye.spring6.service.OrderService
 * @Description : 类描述
 * @author pan
 * @date 2024/4/21 21:44
 */
public class OrderService {

    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void deleteById(int id) {
        orderDao.deleteById();
    }

}
