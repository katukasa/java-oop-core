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
    public void jump(int height) {
        if (maxJump >= height) {
            System.out.println("Котик " + name + " перепрыгнул через стену высотой " + height + " м.");
        }
        else System.out.println("Котик " + name + " не смог перепрыгнуть через стену высотой " + height + " м.");

    }

    @Override
    public void run(int length) {
        if (maxRun >= length) {
            System.out.println("Котик " + name + " пробежал дистанцию длиной " + length + " м.");
        }
        else System.out.println("Котик " + name + " не смог пробежать дистанцию длиной " + length + " м.");

    }
}
