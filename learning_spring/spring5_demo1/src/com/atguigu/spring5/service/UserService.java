package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

public class UserService {

    private UserDaoImpl userDao;

//    public UserService(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.......");
        userDao.update();
    }
}
