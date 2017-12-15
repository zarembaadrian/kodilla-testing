package com.kodilla.forum.collection;

import org.junit.*;
import testing.collection.*;
import java.util.ArrayList;

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


        Assert.assertEquals(evenList, numbersChecking.exterminate(maxList));
    }
}

