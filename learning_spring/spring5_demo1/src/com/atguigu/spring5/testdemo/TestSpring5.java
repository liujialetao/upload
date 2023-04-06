package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    public static void main(String[] args) {
//        testAdd();
        testBook1();
        testOrders();

    }
//    public static void testAdd(){
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
//        User user = context.getBean("user", User.class);
//        System.out.println(user);
//        user.add();
//    }

    public static void testBook1() {
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.testDemo();
    }

    public static void testOrders() {
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        orders.ordersTest();
    }
}
