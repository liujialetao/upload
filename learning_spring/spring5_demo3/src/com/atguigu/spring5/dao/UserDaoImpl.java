package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

//@Repository()
@Component("UserDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao add ....");
    }
}
