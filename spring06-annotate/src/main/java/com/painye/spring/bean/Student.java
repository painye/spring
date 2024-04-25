package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/25 8:45
 */

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName : com.painye.spring.bean.Student
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 8:45
 */

@Component()
@Data
public class Student {

    @Value("jerry")
    private String name;
    @Resource
    private Teacher teacher;
    @Resource
    private ClassNo classNo;


}
