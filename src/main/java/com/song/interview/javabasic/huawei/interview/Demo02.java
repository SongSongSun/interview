package com.song.interview.javabasic.huawei.interview;

import java.util.Scanner;

/**
 * @Author Song
 * @Date 2021/9/2 22:29
 * @Version 1.0
 * @Description 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写，字符串长度小于500。
 * <p>
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
 * <p>
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。
 * <p>
 * 示例1
 * 输入：
 * ABCabc
 * A
 * 复制
 * 输出：
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ch = scanner.nextLine();
        String upStr = str.toUpperCase();
        char up = ch.toUpperCase().charAt(0);
        int count = 0;
        for (int i = 0; i < upStr.length(); i++) {
            if (up == upStr.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
