package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/23 8:35
 */

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName : com.painye.spring.bean.PersonBeanFactory
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 8:35
 */
public class PersonBeanFactory implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }


}
