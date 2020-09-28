package ru.geekbrains.java_core.lesson3_hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> listOfNumbers = new HashMap<>();

    public void add(String name, String phone){
        if(!listOfNumbers.containsKey(name)){
            listOfNumbers.put(name, new HashSet<>());
        }
        Set<String> values = listOfNumbers.get(name);
        values.add(phone);
    }

    public Set<String> get(String name){
//    public void get(String name){
        Set<String> values = listOfNumbers.get(name);
//        System.out.println(name + ": " + values);
        return values;
    }
}
