package com.song.interview.javabasic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Song
 * @Date 2021/7/13 15:26
 * @Version 1.0
 * @Description
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class robotClazz = Robot.class;
        //Class<?> robotClazz = Class.forName("com.song.interview.javabasic.reflect.Robot");
        Robot robot = (Robot) robotClazz.newInstance();
        Field name = robotClazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot, "robot");
        Method sayHi = robotClazz.getMethod("sayHi", String.class);
        sayHi.invoke(robot, "Mike");
        Method throwHello = robotClazz.getDeclaredMethod("throwHello", String.class);
        throwHello.setAccessible(true);
        System.out.println(throwHello.invoke(robot,"bob"));
    }
}
