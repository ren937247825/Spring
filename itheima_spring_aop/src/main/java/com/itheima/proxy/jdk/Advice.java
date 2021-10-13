package com.itheima.proxy.jdk;

public class Advice {
    public void before() {
        System.out.println("前置增加。。。。");
    }

    public void after() {
        System.out.println("后置增强。。。");
    }
}
