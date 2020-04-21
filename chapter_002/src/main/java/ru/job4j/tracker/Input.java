package ru.job4j.tracker;
/**
 * interface Input.
 * Заменяем связь с классом Scanner.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 10.04.2020.
 */
public interface Input {

    String askStr(String question);
    int askInt(String question);
    int askInt(String question, int max);
}
