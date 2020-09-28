package ru.geekbrains.java_core.lesson4.online.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedExample {

    @RepeatedTest(value = 3)
    public void checkSumCorrect(){
        Assertions.assertEquals(2,1 + 1);
    }

    @Test
    public void checkSumException(){
        Assertions.assertEquals(2,1 + 2);
    }

}
