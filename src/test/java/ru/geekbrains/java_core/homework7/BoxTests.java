package ru.geekbrains.java_core.homework7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxTests {

    @Test
    public void testPour(){
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple(), 6);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple(),5);

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange(), 4);

//      Version 1. Test pour method
        appleBox1.pour(appleBox2);
//        appleBox1.pour(orangeBox1); - не компилируется, ок

//      Version 2. Test BoxTransferService class
        BoxTransferService boxTransferService = new BoxTransferService();
        boxTransferService.aggregate(appleBox1,appleBox2);
//        boxTransferService.aggregate(appleBox2,orangeBox1); - не компилируется, ок

    }








}
