package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {

    @Test
    public void shouldReturnFivePairs (){
        int [] A = {0,1,0,1,1};
//        A[0] = 0;
//        A[1] = 1;
//        A[2] = 0;
//        A[3] = 1;
//        A[4] = 1;
        assertEquals(5,new PassingCars().solution(A));
    }
}
