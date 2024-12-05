package com.leepro1.designpattern.abstract_factory.java;

import com.leepro1.designpattern.factory_method.after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext.getBean(Ship.class);
        System.out.println(bean);
    }
}
