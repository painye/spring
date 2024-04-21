package com.painye.spring6.bean;
/**
 * @author pan
 * @date 2024/4/21 22:21
 */

/**
 * @ClassName : com.painye.spring6.bean.Student
 * @Description : 类描述
 * @author pan
 * @date 2024/4/21 22:21
 */
public class Student {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
