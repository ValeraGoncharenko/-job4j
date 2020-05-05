package ru.job4j.stragery;

public class Paint {

    Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.setShape(new Square());
        paint.draw();
        System.out.println();
        paint.setShape(new Triangle());
        paint.draw();
    }
}
