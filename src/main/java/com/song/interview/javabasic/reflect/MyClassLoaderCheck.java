package com.song.interview.javabasic.reflect;

/**
 * @Author Song
 * @Date 2021/7/13 16:53
 * @Version 1.0
 * @Description
 */
public class MyClassLoaderCheck {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader("C:\\Users\\dell\\Desktop\\","myClassLoader");
        Class<?> wali = myClassLoader.findClass("Wali");
        System.out.println(wali.getClassLoader());
        System.out.println(wali.getClassLoader().getParent());
        System.out.println(wali.getClassLoader().getParent().getParent());
        System.out.println(wali.getClassLoader().getParent().getParent().getParent());
        wali.newInstance();
    }
}
