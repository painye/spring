package com.painye.spring.service.cglib;

import com.painye.spring.service.OrderService;
import com.painye.spring.service.impl.OrderServiceImpl;
import junit.framework.TestCase;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author pan
 * @date 2024/4/25 22:36
 */
public class CglibProxyClientTest extends TestCase {

    @Test
    public void test() {
        // 创建字节码增强器
        Enhancer enhancer = new Enhancer();
        // 告诉CGLIB要继承哪个类
        enhancer.setSuperclass(OrderServiceImpl.class);
        // 设置回调接口
        enhancer.setCallback(new TimerMethodInterceptor());
        // 生成源码，编译class，加载到JVM,并创建代理对象
        OrderService orderService = (OrderService) enhancer.create();
        orderService.generate();
        orderService.detail();
        orderService.modify();
    }

}