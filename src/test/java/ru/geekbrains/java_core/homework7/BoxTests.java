package ru.geekbrains.java_core.homework7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxTests {

    @Test
    void checkGetWeight(){
        Box<Apple> appleBox1 = new Box<>(3, "Apples");
//        Assertions.assertEquals(300,appleBox1.getWeight());
        org.assertj.core.api.Assertions.assertThat(appleBox1.getWeight()).isEqualTo(300);
    }

    @Test
    void checkCompare(){
        Box<Apple> appleBox1 = new Box<>(3, "Apples");
        Box<Orange> orangeBox1 = new Box<>(3, "Oranges");
        org.assertj.core.api.Assertions.assertThat(orangeBox1.compareTwoBoxes(appleBox1)).isFalse();
    }

    @Test
    void checkMoveFruitToOtherBox(){
        Box<Apple> appleBox1 = new Box<>(3, "Apples");
        Box<Apple> appleBox2 = new Box<>(4, "Apples");
        appleBox1.moveFruitToOtherBox(appleBox2);
        org.assertj.core.api.Assertions.assertThat(appleBox1.amountOfFruits).isEqualTo(0);
        org.assertj.core.api.Assertions.assertThat(appleBox2.amountOfFruits).isEqualTo(7);
    }

    @Test
    void checkAddFruitToBox(){
        Box<Apple> appleBox1 = new Box<>(3, "Apples");
        appleBox1.addFruitToBox();
        org.assertj.core.api.Assertions.assertThat(appleBox1.amountOfFruits).isEqualTo(4);
    }

}
