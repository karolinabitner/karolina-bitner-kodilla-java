package com.kodilla;

public class Calculator {
    public void someMethod(){
        System.out.println("It works!");
    }


    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.someMethod();

        int numberOne = 30;

        int numberTwo = 50;

        int add = numberOne + numberTwo;

        System.out.println(add);

        int numberOne1 = 50;

        int numberTwo2 = 30;

        int sub = numberOne1 - numberTwo2;

        System.out.println(sub);
    }
}
