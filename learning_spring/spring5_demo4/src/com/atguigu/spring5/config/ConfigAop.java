package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.atguigu.spring5")
@EnableAspectJAutoProxy(proxyTargetClass = true) //等价于<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
public class ConfigAop {
}
