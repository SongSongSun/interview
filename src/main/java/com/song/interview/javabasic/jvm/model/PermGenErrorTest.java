package com.song.interview.javabasic.jvm.model;

import java.util.Random;

/**
 * @Author Song
 * @Date 2021/8/9 9:59
 * @Version 1.0
 * @Description
 */
public class PermGenErrorTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            getRandomString(1000000).intern();
        }
        System.out.println("Mission Complete");
    }

    private static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder stringBuffer = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int i1 = random.nextInt(62);
            stringBuffer.append(str.charAt(i1));
        }
        return stringBuffer.toString();
    }
}
