package com.wang.proxytest;

/**
 * Created by wangshuyang on 2018-8-30.
 */
public class RealSubject implements Subject {
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

    @Override
    public String bye() {
        System.out.println("bye");
        return "bye";
    }
}
