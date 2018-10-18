package com.codility;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int minSum = A[0] + A[1];
        int tmpSum;
        int result = 0;
        for (int i = 0; i < A.length -2; i++) {
            tmpSum = A[i] + A[i+1];
            if(tmpSum < minSum) {minSum=tmpSum;
                result = i;
            }
        }
        return result;
    }
}
