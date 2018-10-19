package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void shouldBuildTriangle() {
//        A[0] = 10    A[1] = 2    A[2] = 5
//        A[3] = 1     A[4] = 8    A[5] = 20
        int[] A = {10,2,5,1,8,20};
        assertEquals(1, new Triangle().solution(A));
    }
}
