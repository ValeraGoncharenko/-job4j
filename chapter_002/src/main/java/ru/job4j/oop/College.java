package ru.job4j.oop;

public class College {
    public static void main(String[] args) {

        //up casting (из подкласса в суперкласс)
        // создаем объекта класса Freshman.
        Freshman freshman = new Freshman();

        // делаем приведение к типу родителя StudentUp.
        StudentUp studentUp = freshman;

        // делаем приведение к типу родителя Object.
        Object object = studentUp;



    }
}
