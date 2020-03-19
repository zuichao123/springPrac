package com.sunjian.test;

import com.sunjian.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunjian
 * @date 2020/3/14 15:17
 */
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowired.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        applicationContext = new ClassPathXmlApplicationContext("autowired2.xml");
        Person person2 = (Person) applicationContext.getBean("person");
        System.out.println(person2);
    }
}
