package com.painye.spring;
/**
 * @author pan
 * @date 2024/4/23 8:27
 */

import com.painye.spring.bean.Order;
import com.painye.spring.bean.Person;
import com.painye.spring.bean.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : com.painye.spring.TestAll
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 8:27
 */
public class TestAll {


    @Test
    public void testSimpleFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = context.getBean("vip", Vip.class);
        System.out.println(vip);
    }


    @Test
    public void testMyFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }


    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}
