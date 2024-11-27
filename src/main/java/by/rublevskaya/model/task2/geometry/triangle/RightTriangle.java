package main.java.by.rublevskaya.model.task2.geometry.triangle;

public class RightTriangle extends BaseTriangle {
    public RightTriangle(double a, double b) {
        super(a, b, Math.sqrt(a * a + b * b));
    }

    @Override
    public double area() {
        return (a * b) / 2;
    }
}
