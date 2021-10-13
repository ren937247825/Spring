package com.itheima.proxy.cglib;

import com.itheima.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(final String[] args) {
        final Target target = new Target();

        final Advice advice = new Advice();

        //返回值就是动态生成的代理对象，基于cglib
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(Target.class);
        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(target, args);
                advice.after();
                return invoke;
            }
        });
        //创建代理对象
        Target proxy = (Target) enhancer.create();
        proxy.save();
    }
}
