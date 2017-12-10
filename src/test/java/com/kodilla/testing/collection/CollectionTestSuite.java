package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
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

        Random randomGenerator = new Random();

        for(int i  =0 ; i<5 ; i++) {
            maxList.add(randomGenerator.nextInt(30));
        }
        numbersChecking.exterminate(maxList);

        ArrayList<Integer> evenNumberList = new ArrayList<>();
        for(int i=0 ; i<5 ; i++) {
            Integer random = randomGenerator.nextInt(30);
            }



        Assert.assertEquals(numbersChecking.exterminate(evenNumberList), numbersChecking.exterminate(maxList));
    }
}

