package com.painye.spring.factory;
/**
 * @author pan
 * @date 2024/4/23 8:00
 */

/**
 * @ClassName : com.painye.spring.factory.Fighter
 * @Description : 具体产品角色
 * @author pan
 * @date 2024/4/23 8:00
 */
public class Fighter extends Weapon {

    @Override
    public void attack() {
        System.out.println("战斗机发射核弹");
    }
}

