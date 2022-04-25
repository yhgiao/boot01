package com.hz.utils;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Aspect 标注增强类注解标签
 * 增强类
 */
@Aspect
@Component
public class SpringLogger {
//    定义切入点
    @Pointcut("execution(* com.hz.service..*.*(..))")

    public void ponintcut(){}
    /**
     * 前置增强
     */
    @Before("ponintcut()")
    public void beforeLog(){

        System.out.println("这是我的前置增强....");
    }
    /**
     * 后置增强
     */
    @AfterReturning(pointcut = "ponintcut()",returning = "res")
    public void afterReturningLog(Object res){

        System.out.println("这是我的后置增强："+res.toString());
    }
    /**
     * 最终增强
     */
    public void afterLog(){

        System.out.println("这是我的最终增强");
    }
    /**
     * 异常增强
     */
    public void afterThrowingLog(){

        System.out.println("这是我的异常增强");
    }


}
