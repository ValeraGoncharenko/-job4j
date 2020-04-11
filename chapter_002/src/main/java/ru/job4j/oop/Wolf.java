package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        System.out.println(ball + " я тебя съем");
    }

    @Override
    public String toString() {
        return "Wolf{}";
    }
}
