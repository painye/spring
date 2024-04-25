package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/25 8:46
 */

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @ClassName : com.painye.spring.bean.Teacher
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 8:46
 */
@Component()
@Data
public class Teacher {

    @Value("tom")
    private String name;
    @Value("25")
    private int age;
    @Resource
    private ClassNo classNo;
}
