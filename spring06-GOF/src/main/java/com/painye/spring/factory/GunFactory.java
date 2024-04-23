package com.painye.spring.factory;
/**
 * @author pan
 * @date 2024/4/23 8:07
 */

/**
 * @ClassName : com.painye.spring.factory.GunFactorry
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 8:07
 */
public class GunFactory implements WeaponFactory{
    @Override
    public Weapon newInstance() {
        return new Gun();
    }
}
