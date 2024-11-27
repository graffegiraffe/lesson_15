package main.java.by.rublevskaya.model.task3;

import main.java.by.rublevskaya.model.task3.collection.CollectionService;
import main.java.by.rublevskaya.model.task3.exception.InvalidCollectionSizeException;

import java.util.List;
import java.util.Scanner;
/*
Task 3
Create a collection of integers.
Fill the collection with random numbers.
Let the collection size be specified from the console.
Provide a check for validity of the entered collection size.
Calculate and display the arithmetic mean of all elements of the collection.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollectionService collectionService = new CollectionService();
        int size;

        while (true) {
            System.out.println("Enter the size of the collection: ");
            String input = scanner.nextLine();
            try {
                size = Integer.parseInt(input);
                collectionService.validateCollectionSize(size);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, enter an integer");
            } catch (InvalidCollectionSizeException e) {
                System.out.println(e.getMessage());
            }
        }

        List<Integer> numbers = collectionService.generateRandomNumbers(size);
        double average = collectionService.calculateAverage(numbers);
        System.out.println("Collection: " + numbers);
        System.out.println("Arithmetic mean: " + average);
        scanner.close();
    }
}
