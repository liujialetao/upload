package com.atguigu.spring5.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "bookProxy")
public class BookProxy {

    @Pointcut(value = "execution(* com.atguigu.spring5.aopxml.Book.buy(..))")
    public void pointdemo(){}

    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before");
    }
}
