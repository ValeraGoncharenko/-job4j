package ru.job4j.calculator;
/**
 * Класс Calculator: +,-,/,*.
 * @author Valera Goncharenko
 * @version 1
 * @since 20.05.2019
 */
public class Calculator {

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        /**
         * Contains numbers to calculate.
         */
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        /**
         * Contains numbers to +,-,/,*.
         */
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        /**
         * line output to the console.
         */
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
