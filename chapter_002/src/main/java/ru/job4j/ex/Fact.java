package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int result = fact.calc(-1);
        System.out.println(result);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter is less than zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
