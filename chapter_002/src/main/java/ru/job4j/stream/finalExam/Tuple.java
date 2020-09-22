package ru.job4j.stream.finalExam;

import java.util.Objects;
/**
 * Класс Tuple содержит результаты: имя и баллы.
 * @author Valera Goncharenko.
 * @version 1.
 * @since 19.09.2020.
 */
public class Tuple {
    private String name;
    private double score;

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.score, score) == 0 &&
                Objects.equals(name, tuple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
