package ru.geekbrains.java_core.lesson4.online.annotations.befote_and_after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BeforeConfigTest {

    @BeforeAll
    public static void beforeAllBeforeConfigTest() {
        System.out.println("BeforeConfigTest.beforeAllBeforeConfigTest");
    }

    @BeforeEach
    public void setUpBeforeConfigTest(){
        System.out.println("BeforeConfigTest.setUpBeforeConfigTest");
    }

    @AfterEach
    public void tearDownBeforeConfigTest(){
        System.out.println("BeforeConfigTest.tearDownBeforeConfigTest");
    }

    @AfterAll
    public static void afterAllBeforeConfigTest(){
        System.out.println("BeforeConfigTest.afterAllBeforeConfigTest");
    }

}
