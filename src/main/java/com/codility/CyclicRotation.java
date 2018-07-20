package com.codility;

import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {
    public int[] solution (int[] A, int K) {
        List<Integer> resultList = new ArrayList<>();
        int [] output = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            resultList.add(0);
        }
        int newIndex;
        for (int i = 0; i < A.length; i++) {
            newIndex = (i + K) % A.length;

            resultList.set(newIndex, A[i]);
        }
        for (int i = 0; i < output.length; i++) {
            output[i] = resultList.get(i);
        }
        System.out.println(output);
        return output;
    }

}
