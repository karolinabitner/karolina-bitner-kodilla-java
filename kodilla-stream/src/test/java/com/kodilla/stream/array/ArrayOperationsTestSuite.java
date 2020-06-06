package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGerAverage()
        //given
        int numbers [] = {1,3,5,7,9,11,13,16,16};
        //when
        double average = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertEquals(9.0, average)
}
