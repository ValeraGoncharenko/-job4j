package ru.job4j.tracker;

import java.util.Scanner;
/**
 * Реализует interface Input, работает с Scanner.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 10.04.2020.
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
