package com.hz.dao.impl;

import com.hz.dao.UserDao;
import com.hz.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoimpl implements UserDao {
    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public int saveUser() {
        System.out.println("调用DAO层saveUser方法");
        return 0;
    }
}

