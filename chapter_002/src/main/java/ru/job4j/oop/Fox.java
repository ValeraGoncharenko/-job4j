package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball){
        System.out.println(ball + " я тебя съем");
    }

    public void eat(Ball ball){
        System.out.println(" Нет съем");
        System.out.println(" Ням, ням, ням");
    }

    @Override
    public String toString() {
        return "Fox{}";
    }
}
