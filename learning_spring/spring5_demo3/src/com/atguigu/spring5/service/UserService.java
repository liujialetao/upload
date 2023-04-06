package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service //@Component(value = "userService")  Repository Service Controller
public class UserService {
//    @Autowired
//    @Qualifier(value = "userDaoImpl") //Qualififier根据名称，容器中的id值或者
    @Resource(name = "UserDaoImpl1") //根据类型进行注入  name的值，用名称进行注入
    private UserDao userDaoImpl;

    @Value("liujia")
    private String name;
    public void add(){
        System.out.println("service add .....");
        userDaoImpl.add();
    }

    public String getName() {
        return name;
    }
}
