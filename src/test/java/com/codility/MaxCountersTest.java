package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxCountersTest {
    @Test
    public void shouldReturnValuesOfCounters () {
        int [] A = {3, 4, 4, 6, 1, 4, 4};
        int [] result = {3, 2, 2, 4, 2};
        int [] actual = new MaxCounters().solution(5, A);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i],actual[i]);
        }
    }
}
