package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0,numbers.length)
                .forEach(n->System.out.print(numbers[n]));

        double average = IntStream.range(1,numbers.length)
                .mapToDouble(k->numbers[k])
                .average()
                .getAsDouble();


        return average;
    }
}
