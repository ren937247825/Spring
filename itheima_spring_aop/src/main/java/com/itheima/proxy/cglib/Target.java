package com.itheima.proxy.cglib;


import com.itheima.proxy.jdk.TargetInterface;

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save 执行了。。。。");
    }
}
