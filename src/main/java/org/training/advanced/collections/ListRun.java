package org.training.advanced.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRun {

    private static List<String> stringList1 = new ArrayList<>(); // Doğru değil
    private static List<String> stringList2 = new Vector<>();
    private static List<String> stringList3 = Collections.synchronizedList(new ArrayList<>());


    public static void main(String[] args) {
        List<String> stringList1 = Arrays.asList("1",
                                                 "3",
                                                 "2",
                                                 "5",
                                                 "4",
                                                 "9",
                                                 "8",
                                                 "6",
                                                 "7");
        System.out.println(stringList1);
        Collections.sort(stringList1);
        System.out.println(stringList1);

        List<String> mList = new CopyOnWriteArrayList<>();


        MyCollection myCollection = new MyCollection();
        myCollection.add("osman1");
        myCollection.add("osman2");
        myCollection.add("osman3");
        myCollection.add("osman4");
        for (String str : myCollection) {
            System.out.println(str);
        }

        Iterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
//        int i = 100;
//        String str = "osman";
//        str += " yaycıoğlu";
//        String concat = str.concat(" yaycıoğlu");
//        String str1 = "osman " + concat + " " + i;
//
//        int[] ints = new int[10];
//        int[] newInts = new int[15];
//        System.arraycopy(ints,
//                         0,
//                         newInts,
//                         0,
//                         ints.length);
//        ints = newInts;
//
//        List<String> stringList = new ArrayList<>(1_100_000);
//        //List<String> stringList = new LinkedList<>();
////        stringList.add("1");
////        stringList.add("2");
//        long delta = System.currentTimeMillis();
//        for (int j = 0; j < 1_000_000; j++) {
//            stringList.add("hello");
//        }
//        System.out.println("Add delta : " + (System.currentTimeMillis() - delta));
//
//        delta = System.currentTimeMillis();
//        for (int j = 0; j < 10_000; j++) {
//            stringList.get(j);
//        }
//        System.out.println("Get delta : " + (System.currentTimeMillis() - delta));
//
//        delta = System.currentTimeMillis();
//        for (String str5 :
//                stringList) {
//        }
//        System.out.println("Travel delta : " + (System.currentTimeMillis() - delta));
//
//        delta = System.currentTimeMillis();
//        for (int j = 0; j < 1_000; j++) {
//            stringList.remove(0);
//        }
//        System.out.println("Remove delta : " + (System.currentTimeMillis() - delta));
//
//        delta = System.currentTimeMillis();
//        for (int j = 0; j < 100; j++) {
//            stringList.contains("mehmet");
//        }
//        System.out.println("Contains delta : " + (System.currentTimeMillis() - delta));
    }
}
