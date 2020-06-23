package ru.job4j.sort;

import java.util.Arrays;

/**
 * Реализует механизм возврата монет в лендинговых аппаратах.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 7.05.2020.
 */
public class Machine {

    /**
     * Массив для хранения монет.
     */
    private final int[] coins = {10, 5, 2, 1};

    /**
     * Метод добавления заявки в хранилище
     * @param money - сколько внесено денег.
     * @param price - стоимость кофе.
     * @return rsl - массив с здачей.
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;

        for (int i = 0; i < coins.length; i++) {
            while (balance >= coins[i]) {
                balance = balance - coins[i];
                rsl[size] = coins[i];
                size++;
            }

        }
        return Arrays.copyOf(rsl, size);
    }
}
