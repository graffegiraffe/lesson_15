package main.java.by.rublevskaya.model.task2;

import main.java.by.rublevskaya.model.task2.geometry.figure.Figure;
import main.java.by.rublevskaya.model.task2.geometry.quadrangle.Rectangle;
import main.java.by.rublevskaya.model.task2.geometry.quadrangle.Square;
import main.java.by.rublevskaya.model.task2.geometry.ring.Circle;
import main.java.by.rublevskaya.model.task2.geometry.triangle.IsoscelesTriangle;
import main.java.by.rublevskaya.model.task2.geometry.triangle.RightTriangle;

import java.util.ArrayList;
import java.util.List;
/*
Task 2
Create a collection of shapes.
(take the classes for shapes from previous homework)
Fill the collection with different shapes.
Loop through the collection and call a method to calculate and display the perimeter of each shape.
 */
public class Runner {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new RightTriangle(3, 4));
        figures.add(new IsoscelesTriangle(5, 6));
        figures.add(new Circle(3));
        figures.add(new Rectangle(4, 5));
        figures.add(new Square(4));
        figures.forEach(figure -> figure.print());
    }
}
