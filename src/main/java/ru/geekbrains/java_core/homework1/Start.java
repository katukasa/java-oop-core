package ru.geekbrains.java_core.homework1;

public class Start {

    public static void main(String[] args) {
        Human human1 = new Human("Саша", 1, 500);
        Cat cat1 = new Cat("Рыжик", 2, 250);
        Robot robot1 = new Robot("Интеллектуальный", 0, 25);
        Wall wall1 = new Wall(2);
        RunningTrack runningTrack1 = new RunningTrack(150);

//        human.jump(wall.getWallHeight(wall.height));

        IMove[] iMoves = {human1, cat1, robot1};
        for (IMove jumps : iMoves){
            jumps.jump(wall1.height);
        }
        for (IMove runs : iMoves){
            runs.run(runningTrack1.length);
        }

    }
}
