package com.sblog.web;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ysj
 * @date 2019-06-20
 */
public class Singleton {

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();

    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Singleton singleton = Singleton.getInstance();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();

        constructor.setAccessible(true);
        Singleton newSingleton = constructor.newInstance();
        System.out.println(singleton == newSingleton);

    }
}
