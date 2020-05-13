package com.kodilla.testing.collection;

public class OddNumbersExterminator {
    public int exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer>oddNumbersList = new ArrayList<>();

        for(int number : numbers){
            if(number%2==0){
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
