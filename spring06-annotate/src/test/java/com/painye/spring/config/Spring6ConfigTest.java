package com.painye.spring.config;

import com.painye.spring.bean.ClassNo;
import com.painye.spring.bean.Student;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pan
 * @date 2024/4/25 8:52
 */
public class Spring6ConfigTest extends TestCase {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        ClassNo classNo = context.getBean("classNo", ClassNo.class);
        classNo.setClassNo("高一");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

}