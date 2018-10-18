package com.codility;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        if(A.length ==0) return 0;
        int countDistinct = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {
            if(A[i] != A[i+1]) countDistinct++;
        }
        return countDistinct;
    }
}
