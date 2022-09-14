package org.training.advanced.collections;

import org.training.advanced.immutable.Person;
import org.training.advanced.oo.Employee;

import java.util.*;

public class SetRun {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("osman","yaycıoğlu"));
        personSet.add(new Person("osman","yaycıoğlu"));
        personSet.add(new Person("osman","yaycıoğlu"));
        personSet.add(new Person("osman","yaycıoğlu"));
        System.out.println(personSet);
        Set<String> stringSet = new HashSet<>();

        long delta = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++) {
            stringSet.add("hello" + j);
        }
        System.out.println("Add delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (String str5 :
                stringSet) {
        }
        System.out.println("Travel delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++) {
            stringSet.contains("osman" + j);
        }
        System.out.println("Contains delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++) {
            stringSet.remove("hello" + j);
        }
        System.out.println("Remove delta : " + (System.currentTimeMillis() - delta));

    }
}
