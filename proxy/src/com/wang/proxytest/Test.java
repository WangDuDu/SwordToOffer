package com.wang.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wangshuyang on 2018-8-30.
 */
public class Test {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();


        InvocationHandler handler = new InvocationHandlerImpl(realSubject);

        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = realSubject.getClass().getInterfaces();

        Subject subject = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);
        System.out.println("动态代理对象的类型： " + subject.getClass().getName());
        subject.sayHello("Tom");
        subject.bye();
    }
}
