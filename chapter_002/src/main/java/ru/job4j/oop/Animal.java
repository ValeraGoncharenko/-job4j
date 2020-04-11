package ru.job4j.oop;

public class Animal {
    String name;

    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();

        Animal animalName = new Animal("animalName");
        Predator predatorName = new Predator("predatorName");
        Tiger tigerName = new Tiger("tigerName");
    }

}
