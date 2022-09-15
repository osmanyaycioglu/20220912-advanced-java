package org.training.advanced.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamRun1 {
    public static void main(String[] args) {
        List<String> stringList1 = Arrays.asList("osman",
                                                 "ali",
                                                 "veli",
                                                 "ahmet",
                                                 "mehmet",
                                                 "suha",
                                                 "ali",
                                                 "osman",
                                                 "fatma");
        List<String> collect = stringList1.stream()
                                          .distinct()
                                          .filter(s -> s.length() > 4)
                                          .sorted()
                                          .collect(Collectors.toList());

        Set<String> stringSet = new HashSet<>(stringList1);
        List<String> resultList = new ArrayList<>();
        for (String str : stringSet) {
            if (str.length() > 4) {
                resultList.add(str);
            }
        }
        Collections.sort(resultList);
        resultList.forEach(System.out::println);
        System.out.println("---------------");

        collect.forEach(System.out::println);

    }
}
