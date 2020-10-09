package ru.geekbrains.java_core.homework7;

public class BoxTransferService {

    public <A extends Fruit> Box<A> aggregate(Box<A> from, Box<A> to){
        to.box.addAll(from.box);
        from.box.clear();
        return to;
    }
}
