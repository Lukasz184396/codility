package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductOfThreeTest {
    @Test
    public void testForDataFromExample() {
//        A[0] = -3
//        A[1] = 1
//        A[2] = 2
//        A[3] = -2
//        A[4] = 5
//        A[5] = 6
        int[] A = {-3,1,2,-2,5,6};
        assertEquals(60, new MaxProductOfThree().solution(A));
    }

    @Test
    public void testWithHighResultOfMultiplicationFirstTwoNegativeNumbersDataInput() {
//        A[0] = -3
//        A[1] = -10
//        A[2] = 2
//        A[3] = -2
//        A[4] = 5
//        A[5] = 6
        int[] A = {-3,-10,2,-2,5,6};
        assertEquals(180, new MaxProductOfThree().solution(A));
    }
}
