package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest {

    @Test
    public void shouldReturnArrayAfterThreeRotations()
    {
        int [] inputArray = {3, 8, 9, 7, 6};
        int k = 3;
        assertEquals(9, new CyclicRotation().solution(inputArray, k)[0]);
        assertEquals(7, new CyclicRotation().solution(inputArray, k)[1]);
        assertEquals(6, new CyclicRotation().solution(inputArray, k)[2]);
        assertEquals(3, new CyclicRotation().solution(inputArray, k)[3]);
        assertEquals(8, new CyclicRotation().solution(inputArray, k)[4]);
    }

    @Test
    public void shouldReturnArrayAfterOneRotations()
    {
        int [] inputArray = {0, 0, 0};
        int k = 1;

        assertEquals(0, new CyclicRotation().solution(inputArray, k)[0]);
        assertEquals(0, new CyclicRotation().solution(inputArray, k)[1]);
        assertEquals(0, new CyclicRotation().solution(inputArray, k)[2]);

    }

    @Test
    public void shouldReturnArrayAfterFourRotations()
    {
        int [] inputArray = {1, 2, 3, 4};
        int k = 4;


        assertEquals(1, new CyclicRotation().solution(inputArray, k)[0]);
        assertEquals(2, new CyclicRotation().solution(inputArray, k)[1]);
        assertEquals(3, new CyclicRotation().solution(inputArray, k)[2]);
        assertEquals(4, new CyclicRotation().solution(inputArray, k)[3]);
    }

    @Test
    public void shouldReturnArrayAfterOnlyOneRotations()
    {
        int [] inputArray = {3, 8, 9, 7, 6};
        int k = 1;

        assertEquals(6, new CyclicRotation().solution(inputArray, k)[0]);
        assertEquals(3, new CyclicRotation().solution(inputArray, k)[1]);
        assertEquals(8, new CyclicRotation().solution(inputArray, k)[2]);
        assertEquals(9, new CyclicRotation().solution(inputArray, k)[3]);
        assertEquals(7, new CyclicRotation().solution(inputArray, k)[4]);
    }


}