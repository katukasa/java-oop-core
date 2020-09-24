package ru.geekbrains.java_core.homework3.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Tom");
        cats.add("Kitty");
        cats.add("Tiger");

        Iterator<String> iterator = cats.iterator();

        System.out.println(iterator.hasNext());

        while (iterator.hasNext()){
           System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(iterator.hasNext());

    }
}
