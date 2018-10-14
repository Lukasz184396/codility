package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenomicRangeQueryTest {

    @Test
    public void testCAGCCTA () {
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] actual = new GenomicRangeQuery().solution(S,P,Q);
        assertEquals(2, actual[0]);
        assertEquals(4, actual[1]);
        assertEquals(1, actual[2]);
    }

}