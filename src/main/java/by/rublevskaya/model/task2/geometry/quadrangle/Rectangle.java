package main.java.by.rublevskaya.model.task2.geometry.quadrangle;

import main.java.by.rublevskaya.model.task2.geometry.figure.Figure;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle( double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {

        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 *(width + height);
    }
}
