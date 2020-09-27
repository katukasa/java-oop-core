package ru.geekbrains.java_core.homework3.homework.taks2;

import java.util.*;

public class PhoneBook {

    private Map<String, HashSet<Object>> listOfNumbers = new HashMap<>();

    public void add(String name, String phone){
        if(!listOfNumbers.containsKey(name)){
            listOfNumbers.put(name, new HashSet<>());
        }
        Set<Object> values = listOfNumbers.get(name);
        values.add(phone);
    }

//    public Set<String> get(String name){
    public void get(String name){
        Set<Object> values = listOfNumbers.get(name);
        System.out.println(name + ": " + values);
//        return values;
    }
}
