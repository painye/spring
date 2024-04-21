package com.painye.spring6.service;
/**
 * @author pan
 * @date 2024/4/21 21:24
 */

import com.painye.spring6.dao.UserDao;

/**
 * @ClassName : com.painye.spring6.service.UserService
 * @Description : 类描述
 * @author pan
 * @date 2024/4/21 21:24
 */
public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    /**
     * 使用set方方式注入，必须提供set方法
     * 反射机制要调用这个方法进行赋值
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.insert();
    }
}
