package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxCountersTest {
    @Test
    public void shouldReturnValuesOfCounters () {
        int [] A = new int[7];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;
        int [] result = {3, 2, 2, 4, 2};
        assertEquals(result,new MaxCounters().solution(5, A));
    }

}
