package ru.geekbrains.java_core.homework3.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Human, Cat> humanCatHashMap = new HashMap<>(); // <ключ, объект>

        Human alex = new Human("Alex");
        Human kate = new Human("Kate");

        Cat barseek = new Cat("Barseek");
        Cat vasy = new Cat("Vasy");

        // Добавление объектов
        humanCatHashMap.put(alex, barseek);
        humanCatHashMap.put(kate, barseek);
        humanCatHashMap.put(kate, vasy);

        // Получение размера
        System.out.println(humanCatHashMap.size());

        // Получение объекта по ключу
        System.out.println(humanCatHashMap.get(alex));
        System.out.println(humanCatHashMap.get(kate));

        // Получение ключей/значений
        // System.out.println(humanCatHashMap.keySet());
        humanCatHashMap.put(kate, barseek);
        Set<Human> humans = humanCatHashMap.keySet(); // ключи уникальные
        System.out.println(humans);
        Collection<Cat> values = humanCatHashMap.values(); // объекты могут дублироваться поэтому collection
        System.out.println(values);

        // Удаление элементов (по ключу)
        humanCatHashMap.remove(kate);
        System.out.println(humanCatHashMap);
    }
}
