package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringNumbers {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            num.add((int) (Math.random() * 200 + (-100)));
        }

        List<Integer> bugs = num.stream().filter(
                n -> n > 0
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}
