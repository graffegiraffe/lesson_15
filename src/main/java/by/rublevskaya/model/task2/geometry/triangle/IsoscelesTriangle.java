package main.java.by.rublevskaya.model.task2.geometry.triangle;

public class IsoscelesTriangle extends BaseTriangle {
        public IsoscelesTriangle(double equalSide, double base) {
            super(equalSide, equalSide, base);
        }

        @Override
        public double area() {
            double height = Math.sqrt(a * a - (c * c) / 4);
            return (c * height) / 2;
        }
    }