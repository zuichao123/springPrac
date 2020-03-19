package com.sunjian.repository;

import com.sunjian.entity.User2;

/**
 * @author sunjian
 * @date 2020/3/14 15:44
 */
public interface UserRepository {
    public User2 findUserById(Integer id);
}
