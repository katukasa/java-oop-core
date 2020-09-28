package ru.geekbrains.java_core.lesson4.lesson3_hw_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class UniqueWordsTest {

    @Test
    void name() {
        Collection<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("cat");

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        Integer count;
        for (String i : animals){
            count = hashMap.get(i);
            hashMap.put(i, count == null ? 1 : count + 1);
        }

        Assertions.assertEquals(2,hashMap.get("cat"));

    }
}
