package ru.geekbrains.java_core.lesson4.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledExample {

    @Test
    public void checkSumCorrect(){
        Assertions.assertEquals(2,1 + 1);
    }

    @Disabled(value = "Disabled by 01.10.2020")
    @Test
    public void checkSumException(){
        Assertions.assertEquals(2,1 + 2);
    }

}
