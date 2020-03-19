package com.sunjian.test;

import com.sunjian.controller.UserController;
import com.sunjian.entity.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunjian
 * @date 2020/3/14 16:24
 */
public class Test5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        UserController userController = (UserController)applicationContext.getBean("userController");
        User2 user = userController.findUserById(1);
        System.out.println(user);
    }
}
