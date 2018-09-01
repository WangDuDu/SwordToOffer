package com.wang.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wangshuyang on 2018-8-30.
 */
public class Test {
    public static void main(String[] args) {
        // 被代理的真实对象
        Subject realSubject = new RealSubject();

        // 生成一个InvocationHandler对象，并将真实对象作为参数传进去
        InvocationHandler handler = new InvocationHandlerImpl(realSubject);

        // 获取真实对象的类加载器和接口
        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = realSubject.getClass().getInterfaces();

        // 指定类加载器，接口，和InvocationHandler生成动态代理的实例
        Subject subject = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);
        System.out.println("动态代理对象的类型： " + subject.getClass().getName());
        // 通过动态代理的实例来调用真实对象的方法
        subject.sayHello("Tom");
        subject.bye();
    }
}
