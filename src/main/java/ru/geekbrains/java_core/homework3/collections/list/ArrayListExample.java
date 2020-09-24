package ru.geekbrains.java_core.homework3.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Создание коллекции/списка элементов
        // Collection<String> myList1 = new ArrayList<>();
        List<String> myList1 = new ArrayList<>();

        // Добавление одного элемента
        myList1.add("1-1");
        myList1.add("1-2");
        myList1.add("1-2");
        myList1.add("1-2");
        myList1.add("1-2");
        myList1.add("1-2");

        // Добавление элементов из другой коллекции
        Collection<String> myList2 = new ArrayList<>();
        myList2.add("2-1");
        myList2.add("2-2");
        myList1.addAll(myList2);

        // На каком месте находится элемент (не доступно для Collection)
        System.out.println(myList1.indexOf("1-1"));

        // Замена элемента по индексу
        int indexOfZero = myList1.indexOf("1-1");
        myList1.set(indexOfZero, "3-3");

        // Проверка на вхождение одного элемента
        System.out.println(myList1.contains("1-1"));
        System.out.println(myList1.contains("3-3"));

        // Определение размера коллекции
        System.out.println(myList1.size());

        // Проверка на пустоту (есть ли в коллекции элементы)
        System.out.println(myList1.isEmpty());

        // Проверка на вхождение элементов другой коллекции
        System.out.println(myList1.containsAll(myList2));

        // Удаление одного элемента
        myList2.remove("2-2");

        // Удаление элементов другой коллекции
        myList1.removeAll(myList2);

        // Удаление всех элементов
        myList1.clear();



    }
}
