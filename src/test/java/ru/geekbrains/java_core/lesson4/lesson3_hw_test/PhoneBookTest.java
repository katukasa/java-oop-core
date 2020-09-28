package ru.geekbrains.java_core.lesson4.lesson3_hw_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java_core.lesson4.lesson3_hw.PhoneBook;

import java.util.HashSet;
import java.util.Set;

public class PhoneBookTest {

    @Test
    void checkAdd() {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "+111222333");
        phoneBook.add("Ivanov", "+444555666");

        Set<String> expectedPhoneNumber = new HashSet<>();
        expectedPhoneNumber.add("+111222333");
        expectedPhoneNumber.add("+444555666");

        Assertions.assertEquals(expectedPhoneNumber, phoneBook.get("Ivanov"));

    }
}
