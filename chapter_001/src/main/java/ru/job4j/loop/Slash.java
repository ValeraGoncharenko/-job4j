package ru.job4j.loop;
//Выражения для вычисления left и right будут отличаться.
//
//Для вычисления left нужно использовать индексы row и cell.
//
//Для вычисления right нужно использовать индексы row, cell и размер поля size.
// Помните, что мы начинаем считать с 0. Это нужно учитывать при вычислении переменной right.
//
//Также помните, что диагональ есть только в квадрате с нечетной длинной. Это условие проверять не надо.
//
//Не гонитесь решить задачу целиком.
// Попробуйте начала нарисовать только одну диагональ с левого верхнего угла в правый нижний.

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = row + cell == size - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
