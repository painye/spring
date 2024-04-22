package com.painye;
/**
 * @author pan
 * @date 2024/4/19 8:38
 */

import com.painye.spring6.bean.MyDataSource;
import com.painye.spring6.bean.MyTime;
import com.painye.spring6.bean.Student;
import com.painye.spring6.bean.User;
import com.painye.spring6.service.OrderService;
import com.painye.spring6.service.UserService;
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

    @Test
    public void DITest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.save();
    }

    @Test
    public void testConstructDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.deleteById(2);
    }

    @Test
    public void testInnerDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceInner = applicationContext.getBean("userServiceInner", UserService.class);
        userServiceInner.save();
    }

    @Test
    public void testSimpleValue(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student studentBean = context.getBean("studentBean", Student.class);
        System.out.println(studentBean
        );
    }

    @Test
    public void testP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("p.xml");
        UserService userService = context.getBean("userServiceBean", UserService.class);
        userService.save();
    }

    @Test
    public void testC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("p.xml");
        MyTime myTimeBean = context.getBean("myTimeBean", MyTime.class);
        System.out.println(myTimeBean);
    }

    @Test
    public void testAutoWire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        UserService userServiceBean = context.getBean("userServiceBean", UserService.class);
        userServiceBean.save();
    }

    @Test
    public void testProperties(){
        ApplicationContext context = new ClassPathXmlApplicationContext("useJdbc.xml");
        MyDataSource myDataSource = context.getBean("datasourceBean", MyDataSource.class);
        System.out.println(myDataSource);
    }
}
