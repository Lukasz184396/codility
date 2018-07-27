package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayTest {

    @Test
    public void shouldReturnSevenWhenOddIsInTheMiddleOfArray() {
        int [] array = {9,3,9,3,9,7,9};
        assertEquals(7, new  OddOccurrencesInArray().solution(array));
    }

}
