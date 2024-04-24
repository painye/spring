package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/23 22:24
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName : com.painye.spring.bean.LogBeanPostProcessor
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 22:24
 */
public class LogBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器的Before方法执行，即将开始初始化");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器的after方法执行，已完成初始化");
        return bean;
    }

}
