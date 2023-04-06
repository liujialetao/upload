package com.atguigu.spring5.aotowire;

public class Emp {
    //autowire="byName" 可以实现自动装配，bean标签id必须要和这里的 成员变量名一样
    //autowire="byType"的话，不能有多个Dept的bean类
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void test(){
        System.out.println(dept);
    }
}
