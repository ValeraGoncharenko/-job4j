package ru.job4j.ex;


import java.util.Arrays;
import java.util.List;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String val : value) {
            rsl += 1;
            if (val.equals(key)) {
                return rsl;
            }

        }
        throw new ElementNotFoundException("Element not found");
    }

    public static void main(String[] args) {
        try {
            int result = indexOf(new String[]{"a", "b", "c", "d"}, "g");
            System.out.println(result);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }


    }
}


