package com.painye.spring.bean;
/**
 * @author pan
 * @date 2024/4/25 8:46
 */

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName : com.painye.spring.bean.ClassNo
 * @Description : 类描述
 * @author pan
 * @date 2024/4/25 8:46
 */

@Component()
@Scope("prototype")
@Data
public class ClassNo {

    @Value("高三14班")
    private String classNo;

}
