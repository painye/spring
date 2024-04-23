package com.painye.spring.factory;
/**
 * @author pan
 * @date 2024/4/23 8:08
 */

/**
 * @ClassName : com.painye.spring.factory.Client
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 8:08
 */
public class Client {

    public static void main(String[] args) {
        WeaponFactory gunFactory = new GunFactory();
        Weapon weapon = gunFactory.newInstance();
        weapon.attack();
        WeaponFactory fighterFactory = new FighterFactory();
        weapon = fighterFactory.newInstance();
        weapon.attack();
    }
}
