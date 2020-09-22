package ru.job4j.stream.finalExam;
/**
 * Класс Subject описывает школьный предмет и аттестационный балл ученика.
 * @author Valera Goncharenko.
 * @version $Id$.
 * @since 19.09.2020.
 */
public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
