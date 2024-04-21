package com.painye;
/**
 * @author pan
 * @date 2024/4/19 8:38
 */

import com.painye.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : com.painye.Test
 * @Description : 类描述
 * @author pan
 * @date 2024/4/19 8:38
 */
public class Spring6Test {

    @Test
    public void testFirst(){
        ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
        User user = application.getBean("myUserBean", User.class);
        System.out.println(user);
    }
}
