package ru.job4j.collection;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        String[] l = left.split("\\.");
        String[] r = right.split("\\.");
        int o1 = Integer.parseInt(l[0]);
        int o2 = Integer.parseInt(r[0]);
        return Integer.compare(o1, o2);

    }
}
