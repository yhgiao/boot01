package com.hz.service.impl;



import com.hz.pojo.User;
import com.hz.dao.UserDao;
import com.hz.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


//    @Autowired //类型
//    @Qualifier("aa")//+名字

    @Setter
    @Autowired
    private UserDao userDao;


    @Override
    public int saveUser() {
        userDao.saveUser();//主业务
        return  0;
    }

    @Override
    public int updateUser() {
        System.out.println("这是修改");

        return 2;
    }
//    @Override
//    public User findUserById(Integer id) {
//        return  userDao.findUserById(id);
//    }
}