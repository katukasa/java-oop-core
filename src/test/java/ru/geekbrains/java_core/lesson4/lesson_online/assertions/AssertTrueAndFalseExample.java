package ru.geekbrains.java_core.lesson4.lesson_online.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueAndFalseExample {

    @Test
    public void checkTrue(){
        Assertions.assertTrue(true); // same for assertFalse
    }

    @Test
    public void checkTrueFail(){
        Assertions.assertTrue(false);
    }

    @Test
    public void checkNull(){
        String text = null;
        Assertions.assertNull(text); // same for assertNotNull
    }

}
