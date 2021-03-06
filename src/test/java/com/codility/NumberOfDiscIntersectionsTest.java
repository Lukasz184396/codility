package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {
    @Test
    public void shouldReturnElevenIntersections() {
//        A[0] = 1
//        A[1] = 5
//        A[2] = 2
//        A[3] = 1
//        A[4] = 4
//        A[5] = 0
        int[] A = {1,5,2,1,4,0};
        assertEquals(11, new NumberOfDiscIntersections().solution(A));
    }

    //this test does not pass -it is mistake on codility?
    @Test
    public void testToPointMistakeOnCodility(){
        int[] A = {1,5};
        assertEquals(0, new NumberOfDiscIntersections().solution(A));
    }

    //probably good solution is solution2 method
    @Test
    public void testToPointMistakeOnCodilityWithPossibleGoodSolution(){
        int[] A = {1,5};
        assertEquals(0, new NumberOfDiscIntersections().solution2(A));
    }


}
