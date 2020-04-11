package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public void responseUser(String questions) {
        int answer = new Random().nextInt(3);
        int length = questions.length();
        if (length > 2) {
            if (answer == 0) {
                System.out.println("Да ");
            } else if (answer == 1) {
                System.out.println("Нет ");
            } else {
                System.out.println("Может быть ...");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        System.out.print("Введите вопрос (больше двух символов) : ");
        String question = input.nextLine();
        MagicBall magicBall = new MagicBall();
        magicBall.responseUser(question);

    }
}
