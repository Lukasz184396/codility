package com.codility;


public class TapeEquilibrium {
    public int solution(int[] A) {

        long firstSum = A[0];
        long secondSum = 0;

        for (int i =1;i<A.length;i++)
            secondSum += A[i];

        long minDifferenceBetweenSums = Math.abs(Math.abs(secondSum)+Math.abs(firstSum));

        for (int indexOfSeparation=1; indexOfSeparation<A.length; indexOfSeparation++)
        {
            if ( Math.abs(firstSum - secondSum) < minDifferenceBetweenSums )
                minDifferenceBetweenSums = Math.abs( firstSum - secondSum );
            firstSum += A[indexOfSeparation];
            secondSum -=A[indexOfSeparation];
        }
        return (int) minDifferenceBetweenSums;
    }

}

