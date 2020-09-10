package ru.geekbrains.java_core.homework1;

public class Cat implements IMove {
    public String name;
    public int maxJump;
    public int maxRun;

    public Cat (String name, int  maxJump, int maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void jump(int size) {
        System.out.print ("Котик " + name + " прыгает через стену высотой " + size + " м. ");
    }

    @Override
    public int getMaxJump(){
        return maxJump;
    }

    @Override
    public void run(int size) {
        System.out.print ("Котик " + name + " пытается пробежать " + size + " м. ");
    }

    @Override
    public int getMaxRun(){
        return maxRun;
    }

}
