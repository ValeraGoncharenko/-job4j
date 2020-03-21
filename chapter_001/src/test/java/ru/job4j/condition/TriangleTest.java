package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**Вычисление площади треугольника Test.
 * @author Valera Goncharenko (goncharikvv@gmail.com).
 * @version $Id$.
 * @since 22.03.2020.
 */
public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(first, second, third);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void notExist() {
        boolean result = Triangle.exist(2.0, 2.0, 6.0);
        assertThat(result, is(false));
    }
}