package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        // 外部bean测试
        test_outer_bean();
        // 内部bean测试
        test_inner_bean();
        // 级联赋值测试
        test_jilian();
    }

    public static void test_outer_bean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    public static void test_inner_bean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    public static void test_jilian(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
