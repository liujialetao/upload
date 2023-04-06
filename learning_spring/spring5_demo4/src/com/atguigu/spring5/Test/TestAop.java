package com.atguigu.spring5.Test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import com.atguigu.spring5.config.ConfigAop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
//        testAopAnno();
        testAopXml();
//        testAopAnno_notxml();
    }
    public static void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
        System.out.println();
    }
    public static void testAopAnno_notxml(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        Book book = context.getBean("book", Book.class);
        book.buy();
        System.out.println();
    }

    public static void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
        System.out.println();
    }
}
