package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.aotowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.facotorybean.Mybean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {


    public static void main(String[] args) {
//        testCollection2();
//        testCollection3();
//        testCollection4();
        testCollection5();

    }

    public static void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);
        book1.test();
        System.out.println(book2);
        book2.test();
    }

    public static void testCollection3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("mybean", Course.class);
        System.out.println(course);
//        mybean.test();
    }

    public static void testCollection4() {
        System.out.println("打印。。。。1");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        System.out.println("打印。。。。2");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
//        mybean.test();
        context.close();
    }

    public static void testCollection5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(emp);
//        mybean.test();
        context.close();
    }
}
