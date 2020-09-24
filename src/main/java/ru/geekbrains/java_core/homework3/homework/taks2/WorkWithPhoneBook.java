package ru.geekbrains.java_core.homework3.homework.taks2;

public class WorkWithPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "+111222333");
        phoneBook.add("Petrov", "+222333444");
        phoneBook.add("Sidorov", "+333444555");
        phoneBook.add("Ivanov", "+444555666");
        phoneBook.add("Petrov", "+222333444");

//        System.out.println(phoneBook.get("Ivanov"));
//        System.out.println(phoneBook.get("Petrov"));
//        System.out.println(phoneBook.get("Sidorov"))

        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");
        phoneBook.get("Sidorov");

    }
}
