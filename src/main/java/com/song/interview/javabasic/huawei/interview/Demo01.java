package com.song.interview.javabasic.huawei.interview;

import java.util.Scanner;

/**
 * @Author Song
 * @Date 2021/9/2 22:21
 * @Version 1.0
 * @Description 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() > 5000) {
            return;
        }
        String[] strArray = str.split(" ");
        int i = strArray.length;
        System.out.println(strArray[i-1].length());
    }
}
