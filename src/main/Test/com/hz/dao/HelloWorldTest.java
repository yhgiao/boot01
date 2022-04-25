package com.hz.dao;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void show() {
        //读取spring.xml文件

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
          //强转 控制反转
        HelloWorld helloWord =(HelloWorld)applicationContext.getBean("userS");
        helloWord.show();
    }
}