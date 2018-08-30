package com.wang.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangshuyang on 2018-8-30.
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private Object subject;

    public InvocationHandlerImpl(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("1==========在调用实际方法之前做一些事情==========");
        System.out.println("2==========当前调用的方法是=========" + method.getName());
        result = method.invoke(subject, args);
        System.out.println("3==========方法的返回值是==========" + result);
        System.out.println("4==========可以调用实际方法之后做一些事情==========");
        System.out.println("************************************************");
        return result;
    }
}
