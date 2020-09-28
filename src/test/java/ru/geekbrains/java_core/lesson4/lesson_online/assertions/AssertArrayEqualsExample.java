package ru.geekbrains.java_core.lesson4.lesson_online.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrayEqualsExample {

    @Test
    public void checkArrays(){
        String[] cats1 = {"Barseek", "Murseek"};
        String[] cats2 = {"Barseek", "Tomas"};
        Assertions.assertArrayEquals(cats1, cats2);
    }

}
