package com.song.interview.javabasic.huawei.interview;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * @Author Song
 * @Date 2021/9/2 23:09
 * @Version 1.0
 * @Description
 */
public class Demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            deque.push(array[i]);
            deque.push(" ");
        }
        deque.pop();
        StringBuilder sb = new StringBuilder();
        while (deque.size() > 0) {
            sb.append(deque.pop());
        }
        System.out.println(sb);
    }
}
