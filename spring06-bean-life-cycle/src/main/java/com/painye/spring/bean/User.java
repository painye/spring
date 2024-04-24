package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/23 22:00
 */

/**
 * @ClassName : com.painye.spring.bean.User
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 22:00
 */
public class User {

    private String name;

    public User(){
        System.out.println("1、实例化bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2、Bean属性赋值");
    }

    public void initBean() {
        System.out.println("3、初始化Bean");
    }

    public void destroyBean() {
        System.out.println("5、销毁Bean");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
