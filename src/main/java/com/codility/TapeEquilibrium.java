package com.codility;


import java.util.Arrays;

public class TapeEquilibrium {
    public int solution(int[] A) {

        long firstSum = A[0];
        long secondSum = Arrays.stream(A).sum() - firstSum;

        long minDifferenceBetweenSums = Math.abs(Math.abs(secondSum)+Math.abs(firstSum));

        for (int indexOfSeparation=1; indexOfSeparation<A.length; indexOfSeparation++)
        {
            if ( Math.abs(Math.abs(firstSum) - Math.abs(secondSum)) < minDifferenceBetweenSums )
                minDifferenceBetweenSums = Math.abs( Math.abs(firstSum) - Math.abs(secondSum) );
            firstSum += A[indexOfSeparation];
            secondSum -=A[indexOfSeparation];
        }
        return (int) minDifferenceBetweenSums;
    }

}

