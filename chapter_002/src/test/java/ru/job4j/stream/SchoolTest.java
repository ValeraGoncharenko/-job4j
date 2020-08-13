package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void collect10A(){
        School school = new School();
        List<Student> student = Collections.singletonList(new Student("Honcharenko", 80));
        Predicate<Student> predicate = s -> s.getScore() > 70;
        school.collect(student, predicate);
        assertThat(student.get(0).getSurname(), is("Honcharenko"));
    }

    @Test
    public void collect10B(){
        School school = new School();
        List<Student> student = Collections.singletonList(new Student("Honchar", 60));
        Predicate<Student> predicate = s -> s.getScore() > 50 & s.getScore() < 70;
        school.collect(student, predicate);
        assertThat(student.get(0).getSurname(), is("Honchar"));
    }

    @Test
    public void collect10V(){
        School school = new School();
        List<Student> student = Collections.singletonList(new Student("Ho", 40));
        Predicate<Student> predicate = s -> s.getScore() < 50;
        school.collect(student, predicate);
        assertThat(student.get(0).getSurname(), is("Ho"));
    }
}