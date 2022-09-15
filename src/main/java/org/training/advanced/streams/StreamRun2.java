package org.training.advanced.streams;

import org.training.advanced.immutable.PersonMutable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun2 {
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
        List<Integer> a = stringList1.stream()
                                     .skip(1)
                                     .limit(10)
                                     .distinct()
                                     .peek(s -> System.out.println("after distinct : " + s))
                                     .filter(s -> s.length() > 4)
                                     .peek(s -> System.out.println("after filter : " + s))
                                     .map(s -> PersonMutable.createPerson()
                                                            .setName(s))
                                     .filter(pm -> pm.getName()
                                                     .contains("a"))
                                     .map(z -> z.getName()
                                                .length())
                                     .filter(i -> i > 4)
                                     .collect(Collectors.toList());


    }
}
