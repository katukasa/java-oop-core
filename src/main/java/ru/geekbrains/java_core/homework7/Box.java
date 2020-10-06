package ru.geekbrains.java_core.homework7;

public class Box<A extends Fruit> {

    int amountOfFruits;
    String fruitType;

    public Box(int amountOfFruits, String fruitType) {
        this.amountOfFruits = amountOfFruits;
        this.fruitType = fruitType;
    }

    public int getWeight(){
        int boxWeight = 0;
        if (fruitType.equals("Apples")){
            boxWeight = 100 * amountOfFruits;
        }
        if (fruitType.equals("Oranges")){
            boxWeight = 150 * amountOfFruits;
        }
        return boxWeight;
    }

    public boolean compareTwoBoxes(Box<?> otherBox){
        return getWeight() == otherBox.getWeight();
    }

    public void moveFruitToOtherBox(Box<A> otherBox){
        otherBox.amountOfFruits = otherBox.amountOfFruits + amountOfFruits;
        amountOfFruits = 0;
    }

    public void addFruitToBox(){
        amountOfFruits++;
    }

}
