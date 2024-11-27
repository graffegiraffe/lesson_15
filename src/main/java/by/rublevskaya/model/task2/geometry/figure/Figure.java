package main.java.by.rublevskaya.model.task2.geometry.figure;

public abstract class Figure {

    public abstract double area();
    public abstract double perimeter();

    public void print() {
        System.out.println( "area is " + area());
        System.out.println( "perimeter is " + perimeter());
        System.out.println("---------");
    }
}
