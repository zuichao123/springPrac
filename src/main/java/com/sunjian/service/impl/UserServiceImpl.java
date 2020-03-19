package com.sunjian.service.impl;

import com.sunjian.entity.User2;
import com.sunjian.repository.UserRepository;
import com.sunjian.repository.impl.UserRepositoryImpl;
import com.sunjian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sunjian
 * @date 2020/3/14 15:38
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User2 findUserBuId(Integer id) {
        return userRepository.findUserById(id);
    }

    public void setUserRepository(UserRepositoryImpl userRepository) {
    }
}
