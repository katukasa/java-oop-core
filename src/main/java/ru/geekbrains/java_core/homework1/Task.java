package ru.geekbrains.java_core.homework1;

public class Task {

    int size;

    public Task(int size) {
        this.size = size;
    }

    public void result(int size, int max) {
        if (max >= size) {
            System.out.println("Получилось!");
        } else {
            System.out.println("Не получилось :(");
        }
    }
}

