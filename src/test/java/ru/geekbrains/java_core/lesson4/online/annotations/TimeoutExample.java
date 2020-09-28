package ru.geekbrains.java_core.lesson4.online.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TimeoutExample {

    @Test
    public void checkSumCorrect(){
        Assertions.assertEquals(2,1 + 1);
    }

    @Timeout(value = 1500, unit = TimeUnit.MILLISECONDS) // 1,5 секунды   // по умолчанию - в секундах
    @Test
    public void checkSumException() throws InterruptedException {
        sleep(2000);
        Assertions.assertEquals(2,1 + 2);
    }

}
