package main.java.by.rublevskaya.model.task2.geometry.ring;

import main.java.by.rublevskaya.model.task2.geometry.figure.Figure;

public class Circle extends Figure {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
