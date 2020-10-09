package ru.job4j.stream.finalExam;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Класс Analyze получает статистику по аттестатам.
 * @author Valera Goncharenko.
 * @version 1.
 * @since 19.09.2020.
 */
public class Analyze {

    /**
     * Метод вычисляет общий средний балл.
     * @param stream - стрим Pupil.
     * @return - result или 0.
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(Collectors.averagingDouble(Subject::getScore));
    }

    /**
     * Метод вычисляет средний балл ученика по его предметам.
     * @param stream - стрим Pupil.
     * @return - список из объекта Tuple (имя ученика и средний балл).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(p -> new Tuple(p.getName(), p.getSubjects()
                .stream()
                .collect(Collectors.averagingDouble(Subject::getScore))))
                .collect(Collectors.toList());
    }

    /**
     * Метод вычисляет средний балл по всем предметам для каждого ученика.
     * @param stream - стрим Pupil.
     * @return - список из объекта Tuple (название предмета и средний балл).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream().map(s -> new Tuple (s.getKey(), s.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Метод возвращает лучшего ученика. Лучшим считается ученик с наибольшим баллом по всем предметам.
     * @param stream - стрим Pupil.
     * @return - объект Tuple (имя ученика, сумма баллов  ученика).
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(p -> new Tuple(p.getName(), p.getSubjects()
                .stream()
                .mapToInt(Subject::getScore)
                .sum())).
                max(Comparator.comparingDouble(Tuple::getScore)).
                orElse(null);
    }

    /**
     * Метод возвращает предмет с наибольшим баллом для всех студентов.
     * @param stream - стрим Pupil.
     * @return - объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету).
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
}
