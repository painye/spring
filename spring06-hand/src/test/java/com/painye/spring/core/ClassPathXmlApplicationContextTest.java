package com.painye.spring.core;

import com.painye.spring.bean.User;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author pan
 * @date 2024/4/24 22:30
 */
public class ClassPathXmlApplicationContextTest extends TestCase {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
        Object userBean = context.getBean("userBean");
        System.out.println(userBean);
        Object addrBean = context.getBean("addrBean");
        System.out.println(addrBean);

    }

}