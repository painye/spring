package com.painye.spring.reflect;
/**
 * @author pan
 * @date 2024/4/24 21:17
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName : com.painye.spring.reflect.SystemService
 * @Description : 类描述
 * @author pan
 * @date 2024/4/24 21:17
 */
public class SystemService {

    public void logout(){
        System.out.println("退出系统");
    }

    public boolean login(String username, String password){
        if ("admin".equals(username) && "123456".equals(password)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.painye.spring.reflect.SystemService");
            Method login = clazz.getDeclaredMethod("login", String.class, String.class);
            Object o = clazz.newInstance();
            boolean flag =(boolean) login.invoke(o, "admin", "123456");
            System.out.println(flag);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
