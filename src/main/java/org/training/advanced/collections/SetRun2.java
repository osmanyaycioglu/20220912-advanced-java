package org.training.advanced.collections;

import org.training.advanced.immutable.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRun2 {
    public static void main(String[] args) {
        Set<Person> pSet = new TreeSet<>();


        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("3");
        stringSet.add("4");
        stringSet.add("5");
        stringSet.add("6");
        stringSet.add("7");
        stringSet.add("8");
        System.out.println(stringSet);
        Set<String> stringSet2 = new TreeSet<>();
        stringSet2.add("6");
        stringSet2.add("7");
        stringSet2.add("8");
        stringSet2.add("9");
        stringSet2.add("10");
        stringSet2.add("11");
        System.out.println(stringSet2);

        HashSet<String> tempSet = new HashSet<>(stringSet);
        tempSet.retainAll(stringSet2);
        System.out.println("Kesişim : " + tempSet);

        tempSet = new HashSet<>(stringSet);
        tempSet.addAll(stringSet2);
        System.out.println("Birleşim : " + tempSet);

        tempSet = new HashSet<>(stringSet);
        tempSet.removeAll(stringSet2);
        System.out.println("Fark : " + tempSet);

    }
}
