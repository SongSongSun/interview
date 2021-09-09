package com.song.interview.javabasic.huawei.interview;

import java.util.*;

/**
 * @Author Song
 * @Date 2021/9/2 22:41
 * @Version 1.0
 * @Description
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int count = scanner.nextInt();
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                int num = scanner.nextInt();
                if (!list1.contains(num)) {
                    list1.add(num);
                }
            }
            Collections.sort(list1);
            list.addAll(list1);
        }
        list.forEach(System.out::println);

    }
}
