package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double tmp = amount;
        while (tmp > 0) {
            tmp = tmp + percent / 100 * tmp - salary;
            year++;
        }
        return year;
    }
}
