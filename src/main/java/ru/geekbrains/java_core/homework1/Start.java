package ru.geekbrains.java_core.homework1;

public class Start {

    public static void main(String[] args) {
        Human human1 = new Human("Саша", 1, 500);
        Cat cat1 = new Cat("Рыжик", 2, 250);
        Robot robot1 = new Robot("Интеллектуальный", 0, 25);

        Wall wall1 = new Wall(2);
        RunningTrack runningTrack1 = new RunningTrack(150);

        IMove[] iMoves = {human1, cat1, robot1};
        Task[] tasks = {wall1, runningTrack1};
        for (IMove moves : iMoves){
            for (Task barriers : tasks){
                if (barriers instanceof Wall){
                    moves.jump(barriers.size);
                    barriers.result(barriers.size, moves.getMaxJump());
                }
                if (barriers instanceof RunningTrack){
                    moves.run(barriers.size);
                    barriers.result(barriers.size, moves.getMaxRun());
                }
            }
        }

    }
}
