package com.song.interview.javabasic.thread;


/**
 * @Author Song
 * @Date 2021/8/12 16:27
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        int capacity = (1 << Integer.SIZE - 3) - 1;
        System.out.println(Integer.SIZE);
        System.out.println(-1 << Integer.SIZE - 3);
        System.out.println(0 << Integer.SIZE - 3);
        System.out.println(1 << Integer.SIZE - 3);
        System.out.println(2 << Integer.SIZE - 3);
        System.out.println(3 << Integer.SIZE - 3);
        System.out.println(2 & ~capacity);
        System.out.println(2 & capacity);
    }
}
