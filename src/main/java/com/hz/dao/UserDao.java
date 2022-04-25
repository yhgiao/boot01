package com.hz.dao;

import com.hz.pojo.User;

public interface UserDao {

//    public User findUserById(Integer id);

    User findUserById(Integer id);

    public int saveUser();
}
