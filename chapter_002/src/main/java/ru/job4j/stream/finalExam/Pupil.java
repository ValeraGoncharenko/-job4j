package ru.job4j.stream.finalExam;

import java.util.List;
/**
 * Класс Pupil описывает ученика.
 * @author Valera Goncharenko.
 * @version 1.
 * @since 19.09.2020.
 */
public class Pupil {
    private String name;
    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
