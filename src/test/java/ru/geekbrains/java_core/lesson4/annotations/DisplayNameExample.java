package ru.geekbrains.java_core.lesson4.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Checking")

public class DisplayNameExample {

    @DisplayName("Correct")
    @Test
    public void checkSumCorrect(){
        Assertions.assertEquals(2,1 + 1);
    }

    @DisplayName("Wrong")
    @Test
    public void checkSumException(){
        Assertions.assertEquals(2,1 + 2);
    }

}
