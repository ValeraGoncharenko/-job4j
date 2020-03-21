package ru.job4j.oop;

public class Ball {
    public void tryEat(Wolf wolf){
        System.out.println("Не ешь меня " + wolf);
    }

    public void tryEat(Hare hare){
        System.out.println("Не ешь меня " + hare);
    }

    public void tryEat(Fox fox){
        System.out.println("Не ешь меня " + fox);
    }

    @Override
    public String toString() {
        return "Ball{}";
    }
}
