package testing.collection;


import java.util.*;

public class OddNumbersExterminator {
   public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

       ArrayList<Integer>  testedList = new ArrayList<>();
       for (Integer numb : numbers) {
           if (numb % 2 == 0) {
               testedList.add(numb);
           }
       }
   return testedList;
   }
}