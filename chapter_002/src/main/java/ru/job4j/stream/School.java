package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
/*
В школе пришло требование разделить 9А класс на три класса.
У каждого ученика есть общий балл по всем предметам.  int score;
score - может быть в диапазоне от 0 до 100.
Учеников нужно поделить на следующие группы.
10А диапазон балла [70: 100],
10Б диапазон балла [50: 70);
10B диапазон балла (0: 50);
 */
    List<Student> collect(List<Student> students, Predicate<Student> predict){
      return students.stream().filter(predict).collect(Collectors.toList());
    }
}
