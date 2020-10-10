package ru.geekbrains.java_core.homework3.collections.hash_equals;

import java.util.Objects;

public class Cat {
    String name;
    int passport;

    Cat(String name, int passport){
        this.name = name;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return passport == cat.passport &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
}
