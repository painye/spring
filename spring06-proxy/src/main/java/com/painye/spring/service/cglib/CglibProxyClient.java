package com.painye.spring.service.cglib;
/**
 * @author pan
 * @date 2024/4/25 22:01
 */

import com.painye.spring.service.OrderService;
import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName : com.painye.spring.service.cglib.CglibProxyClient
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 22:01
 */
public class CglibProxyClient {

    public static void main(String[] args) {
        // 创建字节码增强器
        Enhancer enhancer = new Enhancer();
        // 告诉CGLIB要继承哪个类
        enhancer.setSuperclass(OrderService.class);
        // 设置回调接口
        enhancer.setCallback(new TimerMethodInterceptor());
        // 生成源码，编译class，加载到JVM,并创建代理对象
        OrderService orderService = (OrderService) enhancer.create();
        orderService.generate();
        orderService.detail();
        orderService.modify();
    }
}
