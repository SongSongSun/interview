package com.song.interview.javabasic.huawei.interview;

import java.util.*;

/**
 * @Author Song
 * @Date 2021/9/2 23:39
 * @Version 1.0
 * @Description 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词属于字母表的下面，如下所示：
 * <p>
 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 * <p>
 * T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 * <p>
 * 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
 * <p>
 * 请实现下述接口，通过指定的密匙和明文得到密文。
 */
public class Demo36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        while (scanner.hasNext()) {
            String key = scanner.nextLine().toUpperCase();
            String needToEncryptStr = scanner.nextLine();
            String zimu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            LinkedHashSet<Character> characters = new LinkedHashSet<>();
            for (int i = 0; i < key.length(); i++) {
                characters.add(key.charAt(i));
            }
            Map<String, String> hashMap = new HashMap<>();
            int j = 0;
            for (Character ch : characters) {
                hashMap.put(zimu.charAt(j) + "", ch + "");
                j++;
            }

            List<Character> chList = new ArrayList<>();
            for (int i = 0; i < zimu.length(); i++) {
                if (!characters.contains(zimu.charAt(i))) {
                    chList.add(zimu.charAt(i));
                }
            }
            for (Character ch : chList) {
                hashMap.put(zimu.charAt(j) + "", ch + "");
                j++;
            }
            Map<String, String> allHashMap = new HashMap<>();
            allHashMap.putAll(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                allHashMap.put(entry.getKey().toString().toLowerCase(), entry.getValue().toString().toLowerCase());
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < needToEncryptStr.length(); i++) {
                sb.append(allHashMap.get(needToEncryptStr.charAt(i) + ""));
            }
            strList.add(sb.toString());
        }
        strList.forEach(System.out::println);
    }
}
