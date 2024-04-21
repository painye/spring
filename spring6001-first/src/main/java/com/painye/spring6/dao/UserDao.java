package com.painye.spring6.dao;
/**
 * @author pan
 * @date 2024/4/21 21:20
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName : com.painye.spring6.dao.UserDao
 * @Description : 类描述
 * @author pan
 * @date 2024/4/21 21:20
 */
public class UserDao {

    Logger logger =  LoggerFactory.getLogger(UserDao.class);

    public void insert() {
        logger.info("正在插入用户");
    }
}
