package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(0.5 ,2));
        } catch (Exception e) {
            System.out.println("Exception " + e);

        } finally {
            System.out.println("Finish :)");
        }
    }
}
