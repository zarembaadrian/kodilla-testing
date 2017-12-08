package com.kodilla.testing.collection;


import java.util.*;

class OddNumbersExterminator {
   public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

       ArrayList<Integer>  testedList = new ArrayList<>();
       for (Integer numb : numbers) {
           int index = 0;
          Integer object = numbers.get(index++);

           if (object % 2 == 0) {
               testedList.add(object);
           }
       }
   return testedList;
   }
}