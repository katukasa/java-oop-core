package ru.geekbrains.java_core.lesson4.lesson_online.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualsExample {

    @Test
    public void checkSumCorrect(){
        Assertions.assertEquals(2,1 + 1);
    }

    @Test
    public void checkSumException(){
        Assertions.assertEquals(2,1 + 2);
    }

}
