package com.codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {

        //You are given n counters, initially set to 0
        int[] result = new int[N];
        for (int X = 0; X < result.length; X++) {
            result[X] = 0;
        }
        //----------------------------------------------------

        //A non-empty array A of M integers is given
        int M = A.length;

        for (int K = 0; K < A.length; K++) {
            for( int X =0; X< result.length; X++) {
                //if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
                if(A[K] == X+1) result[X]++;
                //if A[K] = N + 1 then operation K is max counter.
                if(A[K] == N+1) maxCaunter(result);
            }
        }
        for (int X = 0; X < result.length; X++) {
            System.out.println(result[X]);
        }
        return result;
    }
    public static int [] maxCaunter(int[] input) {
        int max = 0;
        for (int i = 0; i <input.length ; i++) {
            if( input[i] > max ) max = input[i];
        }
        for (int i = 0; i < input.length; i++) {
            input[i] = max;
        }
        return input;
    }


}
