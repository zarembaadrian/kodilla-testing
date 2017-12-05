package com.kodilla.testing;
import com.kodilla.testing.calculator.CalculatorApi;

public class TestingMain {
    public static void main (String[]args) {
        CalculatorApi myCalculator = new CalculatorApi();

        // test with add

        int resultadd = myCalculator.addAToB(10, 7);

        if(resultadd == 17) {
            System.out.println("Test with add complete!");
        } else {
            System.out.println("Test with add failed!");
        }

        // test with substract

        int resultsubstract = myCalculator.substractAFromB(50,20);

        if(resultsubstract == 30) {
            System.out.println("Test with substract complete! ");
        } else {
            System.out.println("Test with substract failed!");
        }
    }
}
