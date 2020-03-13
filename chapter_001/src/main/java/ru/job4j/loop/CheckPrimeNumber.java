package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        //Взять числа от 2 до number - 1 и проверить, что число number делится на эти числа. Если делится,
        // то это не простое число и продолжать дальнейшие вычисления не нужно.
        // То есть тут нужно поставить оператор break;
        if (number == 1) {
            prime = false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
