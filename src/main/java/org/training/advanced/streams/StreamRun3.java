package org.training.advanced.streams;

import org.training.advanced.immutable.PersonMutable;

import java.util.*;
import java.util.stream.Collectors;

public class StreamRun3 {
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
        Map<String, PersonMutable> collect = stringList1.stream()
                                                        .distinct()
                                                        .filter(s -> s.length() > 4)
                                                        .collect(Collectors.toMap(s -> s,
                                                                                  s -> PersonMutable.createPerson()
                                                                                                    .setName(s)));

        Set<String> collect1 = stringList1.stream()
                                          .distinct()
                                          .filter(s -> s.length() > 4)
                                          .collect(Collectors.toSet());
        String collect2 = stringList1.stream()
                                     .distinct()
                                     .filter(s -> s.length() > 4)
                                     .collect(Collectors.joining(":"));
        IntSummaryStatistics collect3 = stringList1.stream()
                                                   .distinct()
                                                   .filter(s -> s.length() > 4)
                                                   .collect(Collectors.summarizingInt(s -> s.length()));
        System.out.println(collect3);
    }
}
