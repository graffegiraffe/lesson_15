package main.java.by.rublevskaya.model.task3.collection;

import main.java.by.rublevskaya.model.task3.exception.InvalidCollectionSizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionService {
    private Random random = new Random();

    public void validateCollectionSize(int size) throws InvalidCollectionSizeException {
        if (size <= 0) {
            throw new InvalidCollectionSizeException("The collection size must be a positive number");
        }
    }

    public List<Integer> generateRandomNumbers(int size) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    public double calculateAverage(List<Integer> numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}
