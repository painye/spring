package com.painye.spring6.dao;
/**
 * @author pan
 * @date 2024/4/21 21:40
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName : com.painye.spring6.dao.OrderDao
 * @Description : 类描述
 * @author pan
 * @date 2024/4/21 21:40
 */
public class OrderDao {

    Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void deleteById() {
        logger.info("正在删除订单");
    }
}
