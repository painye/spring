package com.painye.spring;
/**
 * @author pan
 * @date 2024/4/23 22:14
 */

import com.painye.spring.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : com.painye.spring.TestAll
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 22:14
 */
public class TestAll {

    @Test
    public void test57Step(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("userBean", User.class);
        System.out.println("4、使用Bean："+user);
    }


    @Test
    public void testNew(){
        User user = new User();
        user.setName("asdada");
        System.out.println(user);

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("userBean", user);
        User user2 = factory.getBean("userBean", User.class);
        System.out.println(user2);
    }
}
