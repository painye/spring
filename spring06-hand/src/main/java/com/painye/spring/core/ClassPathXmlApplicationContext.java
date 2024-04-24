package com.painye.spring.core;
/**
 * @author pan
 * @date 2024/4/24 21:52
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName : com.painye.spring.core.ClassPathXmlApplicationContext
 * @Description : 类描述
 * @author pan
 * @date 2024/4/24 21:52
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

    @Override
    public Object getBean(String beanId) {
        return beanMap.get(beanId);
    }

    private Map<String, Object> beanMap= new HashMap<>();

    /**
     * 构造函数中解析myspring.xml并构造实例
     * @param path
     */
    public ClassPathXmlApplicationContext(String path) {
        try{
            // 1、先构造实例，提前曝光
            SAXReader reader = new SAXReader();
            Document document = reader.read(ClassLoader.getSystemClassLoader().getResourceAsStream(path));
            List<Node> beanNodes = document.selectNodes("//bean");
            //遍历集合
            beanNodes.forEach(beanNode -> {
                Element  beanElt = (Element) beanNode;
                //获取id
                String id = beanElt.attributeValue("id");
                String className = beanElt.attributeValue("class");
                try {
                    Class aClass = Class.forName(className);
                    Constructor declaredConstructor = aClass.getDeclaredConstructor();
                    Object o = declaredConstructor.newInstance();
                    //存储到Map集合
                    beanMap.put(id, o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            // 2、属性赋值，维护依赖关系
            beanNodes.forEach(beanNode -> {
                Element beanElt = (Element) beanNode;
                String id = beanElt.attributeValue("id");
                Object o = beanMap.get(id);
                List<Element> properties = beanElt.elements("property");
                properties.forEach( property -> {
                    try {
                        String name = property.attributeValue("name");
                        Class<?> type = o.getClass().getDeclaredField(name).getType();
                        Method declaredMethod = o.getClass().getDeclaredMethod("set" + name.toUpperCase().charAt(0) + name.substring(1), type);
                        String value = property.attributeValue("value");
                        String ref = property.attributeValue("ref");
                        Object val = null;
                        if (value != null) {
                            String simpleType = type.getSimpleName();
                            switch (simpleType) {
                                case "byte": case "Byte":
                                    val = Byte.valueOf(value);
                                    break;
                                case "short": case "Short":
                                    val = Short.valueOf(value);
                                    break;
                                case "int": case "Integer":
                                    val = Integer.valueOf(value);
                                    break;
                                case "long": case "Long":
                                    val = Long.valueOf(value);
                                    break;
                                case "float": case "Float":
                                    val = Float.valueOf(value);
                                    break;
                                case "double": case "Double":
                                    val = Double.valueOf(value);
                                    break;
                                case "boolean": case "Boolean":
                                    val = Boolean.valueOf(value);
                                    break;
                                case "char": case "Character":
                                    val = value.charAt(0);
                                    break;
                                case "String":
                                    val = value;
                                    break;
                            }
                            declaredMethod.invoke(o, val);
                        } else {
                            declaredMethod.invoke(o, beanMap.get(ref));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
