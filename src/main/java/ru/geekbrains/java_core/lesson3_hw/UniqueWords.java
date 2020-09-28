package ru.geekbrains.java_core.lesson3_hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {

//        Создать массив с набором из 10–20 слов, должны встречаться повторяющиеся.
//        Найти и вывести список уникальных слов, из которых состоит массив.
//        Посчитать, сколько раз встречается каждое слово.

        Collection<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");
        animals.add("snake");
        animals.add("monkey");
        animals.add("cat");
        animals.add("bird");
        animals.add("cat");
        animals.add("monkey");

        Collection<String> uniqueAnimals = new HashSet<>();
        uniqueAnimals.addAll(animals);
        System.out.println(uniqueAnimals);

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        Integer count;
        for (String i : animals){
            count = hashMap.get(i);
            hashMap.put(i, count == null ? 1 : count + 1);
        }

        System.out.println(hashMap);

    }
}
