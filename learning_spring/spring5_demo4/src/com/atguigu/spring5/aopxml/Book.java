package com.atguigu.spring5.aopxml;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component(value = "book")
public class Book {

    public void buy(){
        System.out.println("buy...");
    }
}
