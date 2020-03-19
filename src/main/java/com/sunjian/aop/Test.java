package com.sunjian.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunjian
 * @date 2020/3/16 8:19
 */
public class Test {
    public static void main(String[] args) {
//        Cal cal = new MyCal();
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
//        Cal proxy = (Cal) myInvocationHandler.bind(cal);
//        System.out.println(proxy.add(10,3));
//        System.out.println(proxy.sub(10,3));
//        System.out.println(proxy.mul(10,3));
//        System.out.println(proxy.div(10,3));

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        Cal cal = (Cal) applicationContext.getBean("myCal");
        System.out.println(cal.add(10,3));
        System.out.println(cal.sub(10,3));
        System.out.println(cal.mul(10,3));
        System.out.println(cal.div(10,3));

    }
}
