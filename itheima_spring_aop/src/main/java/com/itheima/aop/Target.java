package com.itheima.aop;

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save 执行了。。。。");
    }
}
