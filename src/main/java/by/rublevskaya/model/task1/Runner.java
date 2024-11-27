package main.java.by.rublevskaya.model.task1;

import main.java.by.rublevskaya.model.task1.collection.NumberCollection;

import java.util.List;
/*
Task 1
Create a collection of integers and fill it with values entered from the console.
When filling the collection with numbers from the console, you should do type casts.
The following code can be used to cast a string to a number:
int i = Integer.parseInt(str);
or
int val = Integer.valueOf(str);
To finish typing, enter the word "exit".
When casting a string to a number, you should consider the possibility of exceptions.
Some useful code examples for casting a string to a number can be found at the link
https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
Display even numbers from the collection on the screen.
 */
public class Runner {
    public static void main(String[] args) {
        NumberCollection collector = new NumberCollection();
        collector.collectNumber();

        List<Integer> numbers = collector.getNumbers();

        System.out.println("Even numbers from the collection:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
