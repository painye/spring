package com.painye.spring;
/**
 * @author pan
 * @date 2024/4/22 21:38
 */

import com.painye.spring.beans.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : com.painye.spring.TestAll
 * @Description : 类描述
 * @author pan
 * @date 2024/4/22 21:38
 */
public class TestAll {

    @Test
    public void testScopeSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean springBean1 = context.getBean("springBean2", SpringBean.class);
        SpringBean springBean2 = context.getBean("springBean2", SpringBean.class);
        System.out.println(springBean1);
        System.out.println(springBean2);
    }

    @Test
    public void testThreadScopeBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean threadBean1 = context.getBean("threadBean", SpringBean.class);
        SpringBean threadBean2 = context.getBean("threadBean", SpringBean.class);
        System.out.println(threadBean1);
        System.out.println(threadBean2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean b1 = context.getBean("threadBean", SpringBean.class);
                SpringBean b2 = context.getBean("threadBean", SpringBean.class);
                System.out.println(b1);
                System.out.println(b2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean b1 = context.getBean("threadBean", SpringBean.class);
                SpringBean b2 = context.getBean("threadBean", SpringBean.class);
                System.out.println(b1);
                System.out.println(b2);
            }
        }).start();
    }
}
