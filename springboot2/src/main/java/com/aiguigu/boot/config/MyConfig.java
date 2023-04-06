package com.aiguigu.boot.config;

import com.aiguigu.boot.bean.Pet;
import com.aiguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User user01(){
        return new User("zhangsan",18);
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
