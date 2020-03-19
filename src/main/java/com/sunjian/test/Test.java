package com.sunjian.test;

import com.sunjian.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunjian
 * @date 2020/3/14 9:14
 */
public class Test {
    public static void main(String[] args) {
        // 加载IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("-------------无参构造方式-------------------------");

        // 根据bean的id去拿
//        Student student = (Student) applicationContext.getBean("stu");
        // 根据类型去拿 （注意：spring.xml中只能有一个class="com.sunjian.entity.Student"）
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);

        System.out.println("-------------有参构造方式-------------------------");

//        Student2 student2 = (Student2) applicationContext.getBean("stu_2");
//        Student2 student2 = (Student2) applicationContext.getBean("stu_3");
        Student2 student2 = (Student2) applicationContext.getBean("stu_1");
        System.out.println(student2);

        System.out.println("--------------两个bean的级联方式------------------------");

        Student3 student3 = (Student3) applicationContext.getBean("stu3");
        System.out.println(student3);

        System.out.println("---------------bean对象之间的集合注入-----------------------");
        Classes classes = (Classes) applicationContext.getBean("classes");
        System.out.println(classes);
    }
}
