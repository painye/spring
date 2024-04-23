package com.painye.spring.factory;
/**
 * @author pan
 * @date 2024/4/23 8:01
 */

/**
 * @ClassName : com.painye.spring.factory.Gun
 * @Description : 具体产品角色
 * @author pan
 * @date 2024/4/23 8:01
 */
public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("开枪射击");
    }
}
