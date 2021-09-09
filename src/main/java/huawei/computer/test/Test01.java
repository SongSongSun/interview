package huawei.computer.test;

import java.io.BufferedInputStream;
import java.util.*;
import java.util.regex.Pattern;

/**
 * @Author Song
 * @Date 2021/9/8 19:40
 * @Version 1.0
 * @Description 寻找top n 的Url
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<String>> resultList = new ArrayList<>();
        HashMap<String, Integer> urlMap = new HashMap<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            if (next.contains(".")) {
                if (urlMap.containsKey(next.trim())) {
                    Integer integer = urlMap.get(next.trim());
                    int count = integer + 1;
                    urlMap.put(next.trim(), count);
                } else {
                    urlMap.put(next.trim(), 1);
                }
            } else {
                int num = Integer.parseInt(next);
                List<Integer> list = new ArrayList<>(urlMap.values());
                List<String> urlList = new ArrayList<>();
                Collections.sort(list);
                List<Integer> list1 = list.subList(list.size() - num, list.size());
                for (Map.Entry<String, Integer> entry : urlMap.entrySet()) {
                    if (list1.contains(entry.getValue())) {
                        if (!urlList.contains(entry.getKey())) {
                            urlList.add(entry.getKey());
                        }
                    }
                }
                Collections.sort(urlList);
                System.out.println();
                resultList.add(urlList);
            }
        }
        for (List<String> list : resultList) {
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    System.out.print(list.get(i));
                    System.out.println();
                } else {
                    System.out.print(list.get(i) + ",");
                }
            }
        }
    }
}

