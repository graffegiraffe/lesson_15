package main.java.by.rublevskaya.model.task1.collection;

import main.java.by.rublevskaya.model.task1.exception.InvalidNumberFormatException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberCollection {
    private List<Integer> numbers;

    public NumberCollection() {
        this.numbers = new ArrayList<>();
    }

    public void collectNumber() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter numbers (to finish entering, enter exit): ");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = parserNumber(input);
                numbers.add(number);
            } catch (InvalidNumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

    private int parserNumber(String input) throws InvalidNumberFormatException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidNumberFormatException("Incorrect input");
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
