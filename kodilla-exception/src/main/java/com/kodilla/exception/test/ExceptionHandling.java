package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge second = new SecondChallenge();
        try{
            second.probablyIWillThrowException(7.0,3.5);
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Done!");
        }

    }
}
