package com.codility;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        if(A.length<3) return 0;
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            if( ( A[i-2] + A[i-1] ) > A[i] ) return 1;
        }
        return 0;
    }
}
