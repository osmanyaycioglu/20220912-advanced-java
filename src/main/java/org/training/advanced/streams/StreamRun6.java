package org.training.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamRun6 {
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

        List<Character> collect = stringList1.stream()
                                             .distinct()
                                             .filter(s -> s.length() > 4)
                                             .flatMap(s -> {
                                                 char[] chars = s.toCharArray();
                                                 Character[] objChar = new Character[chars.length];
                                                 for (int i = 0; i < chars.length; i++) {
                                                     objChar[i] = chars[i];
                                                 }
                                                 return Arrays.stream(objChar);
                                             })
                                             .distinct()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println(collect);
    }
}
