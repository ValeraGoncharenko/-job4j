package ru.job4j.collection;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        Matcher o1 = Pattern.compile("[0-9]*").matcher(left);
        Matcher o2 = Pattern.compile("[0-9]*").matcher(right);
        int result = 0;
        int l;
        int r;
        if (o1.find() && o2.find()) {
            l = Integer.parseInt(o1.group());
            r = Integer.parseInt(o2.group());
            result = Integer.compare(l, r);
        }
        return result;

    }
}
