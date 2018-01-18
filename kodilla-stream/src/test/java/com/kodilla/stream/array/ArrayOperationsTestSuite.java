package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void getAverageTestSuite() {
        int[] numbers = {5,7,9,4,7,2,4,7,10};

        Assert.assertEquals(6.25, getAverage(numbers), 0.1);
    }
}
