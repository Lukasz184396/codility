package com.codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        return A[A.length-1] * A[A.length-2] *A[A.length-3] ;
    }
}
