package com.painye.spring.core;

/**
 * @author pan
 * @date 2024/4/24 21:50
 */
public interface ApplicationContext {

    /**
     * 根据bean的ID获得bean的实例
     * @param beanId
     * @return
     */
    Object getBean(String beanId);
}
