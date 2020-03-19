package com.sunjian.repository.impl;

import com.sunjian.entity.User2;
import com.sunjian.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjian
 * @date 2020/3/14 15:45
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private static Map<Integer, User2> userMap;

    static {
        userMap = new HashMap<Integer, User2>();
        userMap.put(1, new User2(1, "张三"));
        userMap.put(2, new User2(2, "李四"));
    }

    public User2 findUserById(Integer id) {
        return userMap.get(id);
    }
}
