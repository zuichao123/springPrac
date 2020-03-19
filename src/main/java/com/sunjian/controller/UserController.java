package com.sunjian.controller;

import com.sunjian.entity.User2;
import com.sunjian.service.UserService;
import com.sunjian.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author sunjian
 * @date 2020/3/14 15:56
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User2 findUserById(Integer id){
        return userService.findUserBuId(id);
    }
}
