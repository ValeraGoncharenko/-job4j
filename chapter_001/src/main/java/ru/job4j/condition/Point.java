package ru.job4j.condition;

/**
 * pасcтояние методу точками в системе координат.
 * @author Valera Goncharenko
 * @version $Id$
 * @since 22.03.2020.
 */
public class Point {
    /**
     * Это поля объекта. Они доступно только конкретному объекту.
     */
    private int x;
    private int y;
    private int z;
    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод вычисляет расстояние методу точками в системе координат .
     * @param  that точки в системе координат.
     * double first-возводим числа во 2 степень.
     * double second-возводим числа во 2 степень.
     * @return расстояние.
     */
    public double distance(Point that) {
        double first = Math.pow(this.x - that.x, 2);
        double second = Math.pow(this.y - that.y, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    /**
     * Метод вычисляет расстояние между точками в системе координат 3D.
     * @param  that точки в системе координат.
     * double first-возводим числа во 2 степень.
     * double second-возводим числа во 2 степень.
     * double third-возводим числа во 2 степень.
     * @return расстояние.
     */
    public double distance3d(Point that) {
        double first = Math.pow(this.x - that.x, 2);
        double second = Math.pow(this.y - that.y, 2);
        double third = Math.pow(this.z - that.z, 2);
        double rsl = Math.sqrt(first + second + third);
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
