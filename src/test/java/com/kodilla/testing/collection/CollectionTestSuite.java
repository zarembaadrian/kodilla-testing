package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CollectionTestSuite {

    @Test
    public void testCollectionWithEmptyList() {

        OddNumbersExterminator numbersChecking = new OddNumbersExterminator();

        ArrayList<Integer> emptyList = new ArrayList<>();


        Assert.assertEquals(emptyList, numbersChecking.exterminate(emptyList));
    }

    @Test
    public void testCollectionsWithNumbers() {

        OddNumbersExterminator numbersChecking = new OddNumbersExterminator();


        ArrayList<Integer> maxList = new ArrayList<>();
        maxList.add(1);
        maxList.add(2);
        maxList.add(3);
        maxList.add(4);
        maxList.add(5);

        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);


        Assert.assertEquals(numbersChecking.exterminate(maxList), numbersChecking.exterminate(evenList));
    }
}

