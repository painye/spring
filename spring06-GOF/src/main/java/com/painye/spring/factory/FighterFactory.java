package com.painye.spring.factory;
/**
 * @author pan
 * @date 2024/4/23 8:06
 */

/**
 * @ClassName : com.painye.spring.factory.FighterFactory
 * @Description : 类描述
 * @author pan
 * @date 2024/4/23 8:06
 */
public class FighterFactory implements WeaponFactory {

    @Override
    public Weapon newInstance() {
        return new Fighter();
    }
}
