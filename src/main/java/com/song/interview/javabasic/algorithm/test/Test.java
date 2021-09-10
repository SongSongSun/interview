package com.song.interview.javabasic.algorithm.test;

/**
 * @Author Song
 * @Date 2021/9/3 11:05
 * @Version 1.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        int target = 10;
        int i = 1;
        int n = 0;
        while (i <= 10){
            i = i << 1;
            n++;
        }
        System.out.println(n);
    }
}
