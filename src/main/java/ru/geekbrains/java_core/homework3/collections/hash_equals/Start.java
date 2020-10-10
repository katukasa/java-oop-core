package ru.geekbrains.java_core.homework3.collections.hash_equals;

public class Start {

    public static void main(String[] args) {

        Cat kitty = new Cat("Kitty", 123);
        Cat purry = new Cat("Kitty", 123);

        System.out.println(kitty.equals(purry));
        System.out.println(kitty.toString());
        System.out.println(purry.toString());
        System.out.println(kitty.hashCode());
        System.out.println(purry.hashCode());
        System.out.println("".hashCode()); // 0
        System.out.println(Integer.valueOf(5).hashCode()); // 5


    }
}
