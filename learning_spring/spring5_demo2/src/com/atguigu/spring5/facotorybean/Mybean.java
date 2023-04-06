package com.atguigu.spring5.facotorybean;

import com.atguigu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean<Course> {

    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
