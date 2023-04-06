package com.atguigu.spring5.bean;

public class Orders {
    public Orders() {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        System.out.println("第二步 调用set方法设置值");
        this.oname = oname;
    }

    public void initMethod(){
        System.out.println("第三步 执行初始化方法");
    }

    public void destroyMethod(){
        System.out.println("第五步 执行destroyMethod方法");
    }
}
