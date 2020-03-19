package com.sunjian.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author sunjian
 * @date 2020/3/16 8:14
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object = null; // 委托对象

    // 返回代理对象
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "的参数是 " + Arrays.toString(args));
        Object result = method.invoke(this.object, args);
        System.out.print(method.getName() + "的结果是 ");
        return result;
    }
}
