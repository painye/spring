package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/24 21:35
 */

/**
 * @ClassName : com.painye.spring.bean.User
 * @Description : 类描述
 * @author pan
 * @date 2024/4/24 21:35
 */
public class User {
    private String name;
    private int age;
    private Address addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
}
