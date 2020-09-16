package ru.geekbrains.java_core.homework2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    public MyArraySizeException() {
        super();
    }

    public MyArraySizeException(String s) {
        super(s);
    }

    public MyArraySizeException(int index) {
        super(index);
    }
}
