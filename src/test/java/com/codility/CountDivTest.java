package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

    /*
    *For example, for A = 6, B = 11 and K = 2,
    * your function should return 3, because there are three
    * numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
     */
    @Test
    public void shouldReturnNumberOfNumbersDividedByKFromAToBScope() {
        int A = 6;
        int B = 11;
        int K = 2;
        assertEquals(3, new CountDiv().solution(A,B,K));
    }

}
