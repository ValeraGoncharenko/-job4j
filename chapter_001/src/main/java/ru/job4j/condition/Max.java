package ru.job4j.condition;
/**
 * Находит МАХ число.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 22.03.2020.
 */
public class Max {

    /**
     * Метод возвращает максимальное число из двух.
     * @param left - первое число
     * @param right - второе число
     * @return - результат
     */
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    /**
     * Метод возвращает максимальное число из трех.
     * @param left - первое число
     * @param right - второе число
     * @param third - третье число
     * @return - результат
     */
    public static int max(int left, int right, int third) {
        int tmp = max(left, right);
        return max(tmp, third);
    }

    /**
     * Метод возвращает максимальное число из четырех.
     * @param left - первое число
     * @param right - второе число
     * @param third - третье число
     * @param following - четвертое число
     * @return - результат
     */
    public static int max(int left, int right, int third, int following) {
        int tmp = max(left, right, third);
        return max(tmp, following);
    }

}
