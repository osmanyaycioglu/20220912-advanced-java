package org.training.advanced.collections;

import org.training.advanced.immutable.Person;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class MapRun {

    public static AtomicLong counter = new AtomicLong();

    private Map<String, String> map1 = new ConcurrentHashMap<>(2_500_000,
                                                               0.9F,
                                                               1_000);

    public void doSomething() {
        map1.put("osman",
                 "xyz");
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("osman",
                 "deneme");

        Map<String, Person> map2 = new HashMap<>();
        map2.put("osman1",
                 new Person("osman",
                            "yaycıoğlu"));
        map2.put("osman2",
                 new Person("osman",
                            "yaylacı"));
        map2.put("osman3",
                 new Person("osman",
                            "xyz"));
        //map2.putIfAbsent("osmany",new Person("osman","yaylacı"));

        System.out.println(map2);
        Person osmany = map2.get("osman1");

        Set<String> keySet = map2.keySet();
        for (String key : keySet) {
            Person person = map2.get(key);
            System.out.println(person);
        }
        System.out.println("---------------------------");
        Collection<Person> values = map2.values();
        for (Person p : values) {
            System.out.println(p);
        }
        System.out.println("---------------------------");
        Set<Map.Entry<String, Person>> entries = map2.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        Person osman1 = map2.remove("osman1");

        Map<String, List<String>> stringListMap = new HashMap<>();
        Map<String, Map<String, List<String>>> stringListMap2 = new HashMap<>();


        Map<String, StreetList> streetListMap = new HashMap<>();

    }
}
