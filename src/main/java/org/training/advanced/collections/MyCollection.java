package org.training.advanced.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyCollection implements Iterable<String> {

    private List<String> stringList = new ArrayList<>();

    public void add(String str) {
        stringList.add(str);
    }

    public void remove(int index) {
        if (stringList.size() < index) {
            stringList.remove(index);
        }
    }

    public List<String> getCopy(){
        return new ArrayList<>(stringList);
    }
//    public Iterator<String> getIterator(){
//        return stringList.iterator();
//    }

    @Override
    public Iterator<String> iterator() {
        return stringList.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        stringList.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return stringList.spliterator();
    }
}
