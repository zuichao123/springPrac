package com.sunjian.test;

import com.sunjian.entity.Car;
import com.sunjian.factory.InstanceCarFactory;
import com.sunjian.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunjian
 * @date 2020/3/14 14:40
 */
public class Test2 {
    public static void main(String[] args) {
        Car car = StaticCarFactory.getCar(1);
        Car car2 = StaticCarFactory.getCar(2);
        System.out.println(car);
        System.out.println(car2);

        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
        Car car3 = instanceCarFactory.getCar(1);
        Car car4 = instanceCarFactory.getCar(2);
        System.out.println(car3);
        System.out.println(car4);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
        Car car5 = (Car) applicationContext.getBean("car");
        System.out.println(car5);
    }
}
