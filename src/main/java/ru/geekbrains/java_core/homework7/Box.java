package ru.geekbrains.java_core.homework7;

import java.util.ArrayList;
import java.util.List;

public class Box<A extends Fruit> {

    List<A> box = new ArrayList<>();

    public float getWeight(){
        float weight = 0.0f;
        for (A x : box){
            weight += x.getWeight();
        }
        return weight;
    }

    public void addFruit(A fruit, int amount){
        for (int i = 0; i < amount; i++){
            box.add(fruit);
        }
    }

    public boolean compare(Box<?> otherBox){
        return getWeight() == otherBox.getWeight();
    }

    public void pour(Box<A> destination){
        destination.box.addAll(this.box);
        this.box.clear();
    }



}
