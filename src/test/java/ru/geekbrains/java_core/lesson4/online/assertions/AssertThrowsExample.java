package ru.geekbrains.java_core.lesson4.online.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowsExample {

    @Test
    public void checkFileNotFoundException(){
        try {
            Scanner scanner = new Scanner(new File("src/test/resources/file_test1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkAssertThrows(){
        Assertions.assertThrows(
                FileNotFoundException.class,
                () -> new Scanner(new File("src/test/resources/file_test1.txt"))
        );

    }

    @Test
    public void checkAssertThrowsFail(){
        Assertions.assertThrows(
                FileNotFoundException.class,
                () -> new Scanner(new File("src/test/resources/file_test.txt"))
        );

    }

}
