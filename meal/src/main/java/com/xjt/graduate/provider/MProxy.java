package com.xjt.graduate.provider;

import com.xjt.graduate.po.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiongjieteng
 * @date 2019-03-19 - 12:39
 */
public class MProxy implements InvocationHandler {

    private Object target;
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin");
        Object ret = method.invoke(this.target,args);
        System.out.println("end");
        return  ret;
    }
}
