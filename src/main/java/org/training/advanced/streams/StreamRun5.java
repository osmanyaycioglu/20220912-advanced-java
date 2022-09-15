package org.training.advanced.streams;

import org.training.advanced.immutable.PersonMutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamRun5 {
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

        Optional<String> optionalString = stringList1.stream()
                                                     .distinct()
                                                     .filter(s -> s.length() > 4)
                                                     .findAny();
        String str = optionalString.orElse("No data");

        boolean a = stringList1.stream()
                               .distinct()
                               .filter(s -> s.length() > 4)
                               .allMatch(s -> s.contains("a"));

        boolean a1 = stringList1.stream()
                                .distinct()
                                .filter(s -> s.length() > 4)
                                .noneMatch(s -> s.contains("a"));
        boolean a2 = stringList1.stream()
                                .distinct()
                                .filter(s -> s.length() > 4)
                                .anyMatch(s -> s.contains("a"));
    }
}
