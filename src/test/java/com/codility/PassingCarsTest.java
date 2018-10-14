package com.codility;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {

    @Test
    public void shouldReturnFivePairs() {
        int[] A = {0, 1, 0, 1, 1};
//        A[0] = 0;
//        A[1] = 1;
//        A[2] = 0;
//        A[3] = 1;
//        A[4] = 1;
        assertEquals(5, new PassingCars().solution(A));
    }

    @Test
    public void shouldReturnZeroIfIsOnlyOneElementInArray() {
        int[] A = {0};
        assertEquals(0, new PassingCars().solution(A));
    }

    @Test
    public void checkIfIsToManyPairs() {
        int [] A = new int[89442];
        for (int i = 0; i < 89442; i++) {
            if (i % 2 == 0) A[i] = 0;
            else A[i] = 1;
        }
        assertEquals(-1, new PassingCars().solution(A));
    }

    //helper test to check If is to many Pairs
    @Test
    public void checkIndexWhenIsToManyPairs() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            if(i % 2 == 0) list.add(0);
            else list.add(1);
            if(new PassingCars().solution2(list) ==-1) {
                System.out.println("Index:" + i);  //limit value of pairs !!!
                break;
            }
        }
        assertEquals(-1, new PassingCars().solution2(list));
    }
}
