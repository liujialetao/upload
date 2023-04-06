package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect
@Order(1 )
public class UserProxy {
    // 前置通知  在add方法被增强之前执行
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointdemo(){}
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before....");
    }

    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after.... 无论如何都执行");
    }

    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning.... 有异常不执行\nafterReturning后置通知\nafterReturning返回通知");
    }

    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing.... ");
    }

    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");

    }
}
