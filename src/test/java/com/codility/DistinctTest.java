package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctTest {
    @Test
    public void shouldReturnNumberOfDistinctNumbersInArray() {
        int[] A = {2,1,1,2,3,1};
        assertEquals(3, new Distinct().solution(A));
    }

}
