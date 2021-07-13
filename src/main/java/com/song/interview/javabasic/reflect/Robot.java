package com.song.interview.javabasic.reflect;

/**
 * @Author Song
 * @Date 2021/7/13 15:22
 * @Version 1.0
 * @Description
 */
public class Robot {
    private String name;

    public void sayHi(String helloSentence) {
        System.out.println(helloSentence + " " + name);
    }

    private String throwHello(String tag) {
        return "hello " + tag;
    }
}
