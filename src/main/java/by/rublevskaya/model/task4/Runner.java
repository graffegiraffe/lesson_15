package main.java.by.rublevskaya.model.task4;

import java.util.HashSet;
import java.util.Set;
/*
Task 4
Create a collection of unique names of all students in our group + teacher.
Display the collection on the screen.
 */
public class Runner {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Andryusha");
        names.add("Katyusha");
        names.add("Ilyusha");
        names.add("Olezha");
        names.add("Seryozha");
        names.add("Dimochka");
        names.add("Igoryusha");
        names.add("Marinochka");
        names.add("Ritochka");
        names.add("Bogdanchik");
        names.add("Danik");
        names.add("Kiryusha");
        names.add("Sultan");
        names.add("Georgi");
        names.add("Dmitry");
        names.add("Vladusha");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
