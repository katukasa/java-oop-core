package ru.geekbrains.java_core.homework7;

public class Main {
    public static void main(String[] args) {

        // List<Fruit> fruits = new ArrayList<>(); - пример
        Box<Apple> appleBox1 = new Box<>(3, "Apples");
        Box<Apple> appleBox2 = new Box<>(4, "Apples");
        Box<Orange> orangeBox1 = new Box<>(2, "Oranges");
        Box<Orange> orangeBox2 = new Box<>(3, "Oranges");

        // сравнение веса коробок
        // должно быть можно сравнивать вес коробки с яблоками и вес коробки с апельсинами
        System.out.println(appleBox1.compareTwoBoxes(appleBox2));
        System.out.println(orangeBox1.compareTwoBoxes(orangeBox2));
        System.out.println(appleBox1.compareTwoBoxes(orangeBox1));

        // пересыпание фруктов из одной коробки в другую
        orangeBox1.moveFruitToOtherBox(orangeBox2);
        System.out.println(orangeBox1.amountOfFruits + ", " +  orangeBox2.amountOfFruits);

        // пересыпание фруктов из одной коробки в другую (яблоки и апельсины)
        // нельзя пересепать яблоки к апельсинам и наоборот - ок
        // orangeBox2.moveFruitToOtherBox(appleBox1);

        // добавление одного фрукта в коробку
        appleBox1.addFruitToBox();
        System.out.println(appleBox1.amountOfFruits);

    }
}
