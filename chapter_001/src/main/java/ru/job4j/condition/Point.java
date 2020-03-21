package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public double distance(Point that) {
        double first = Math.pow(this.x - that.x, 2);
        double second = Math.pow(this.y - that.y, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
