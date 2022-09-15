package org.training.advanced.streams;

import org.training.advanced.immutable.PersonMutable;

import java.util.*;
import java.util.stream.Collectors;

public class StreamRun4 {
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
        Integer reduce = stringList1.stream()
                                    .distinct()
                                    .filter(s -> s.length() > 4)
                                    .reduce(0,
                                            (i, s) -> i + s.length(),
                                            (i1, i2) -> i1 + i2);
        ArrayList<PersonMutable> reduce1 = stringList1.stream()
                                                      .distinct()
                                                      .filter(s -> s.length() > 4)
                                                      .reduce(new ArrayList<PersonMutable>(),
                                                              (al, s) -> {
                                                                  al.add(PersonMutable.createPerson()
                                                                                      .setName(s));
                                                                  return al;
                                                              },
                                                              (al1, al2) -> {
                                                                  al1.addAll(al2);
                                                                  return al1;
                                                              });
    }
}
