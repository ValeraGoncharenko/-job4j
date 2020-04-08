package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    static int matches = 11;
    static int player;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Количество спичек на столе: " + matches);
            System.out.print("Выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            if(select < 4){
                if(matches <= 0) {
                    if (player % 2 == 0) {
                        System.out.println("Победил игрок № 2");
                    }
                    run = false;
                    }
            }
            matches -= select;
            player++;
            }
    }
}
