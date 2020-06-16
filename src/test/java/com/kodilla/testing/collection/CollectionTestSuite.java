package com.kodilla.testing.collection;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionTestSuite {
    Object oddNumbersExterminator;
    @Before
    public void before(){
        System.out.println("Test: begin");
    }
    @After
    public void after(){
        System.out.println("Test: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
                ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(5);
        normalList.add(4);

        ArrayList<Integer> resultNormalList = new ArrayList<>();
        resultNormalList.add(2);
        resultNormalList.add(4);
        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Test - normal list.");
        //Then
        Assert.assertEquals(resultNormalList, resultList);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer>emptyList = new ArrayList<>();
        //When
        ArrayList<Integer>resultEmptyList;
        resultEmptyList = oddNumbersExterminator(emptyList);
        System.out.println("Test - empty list");
        //Then
        Assert.assertEquals(emptyList, resultEmptyList);

    }
}
