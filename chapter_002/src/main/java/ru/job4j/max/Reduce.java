package ru.job4j.max;
/**
 *Исправить метод to.
 *
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 22.03.2020.
 */
public class Reduce {
    private int[] array;
    /**
     *Метод to(..) должен записать аргумент array в поле класса.
     * @param array - массив
     * @author Valera Goncharenko (goncharikvv@gmail.com).
     * @version $Id$.
     * @since 22.03.2020.
     */
    public void to(int[] array) { //Метод не видит переменную обьекта и компилятор использует локальную переменную, испровляем при помощи this
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) { //Происходит передача в цикл null массива
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
