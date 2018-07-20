package com.codility;

public class CyclicRotation {
    public int[] solution (int[] A, int K) {

        int size = A.length;
        int[] output = new int [size];
        for (int i=0; i<size; i++) {
            output[(i + K) % size] = A[i];
        }

        return output;
    }

}
