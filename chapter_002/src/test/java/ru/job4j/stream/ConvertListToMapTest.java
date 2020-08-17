package ru.job4j.stream;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListToMapTest {

    @Test
    public void transformation() {
        List<Student> students = Collections.singletonList(new Student("Gonchar", 80));
        ConvertListToMap convertListToMap = new ConvertListToMap();
        Map<String, Student> res = convertListToMap.transformation(students);
        Map<String, Student> exp = Collections.singletonMap("Gonchar", new Student("Gonchar", 80));
        assertThat(res, is(exp));
    }
}