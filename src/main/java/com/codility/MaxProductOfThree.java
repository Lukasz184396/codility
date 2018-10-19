package com.codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int maxForOnlyPositive = A[A.length-1] * A[A.length-2] *A[A.length-3];
        int maxWithNegative = A[A.length-1] * A[0] * A[1];
        return maxForOnlyPositive > maxWithNegative ? maxForOnlyPositive : maxWithNegative;
    }
}
