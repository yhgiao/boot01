package com.hz.service;


import com.hz.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public class UserServiceImplTest {

    @Test
    public void findUserById() {
        //读取spring.xml文件

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserService userService = (UserService)applicationContext.getBean("userServiceImpl");
        //userService.saveUser();
        userService.updateUser();


    }
}