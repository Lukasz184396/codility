package com.codility;

import java.util.List;

public class PassingCars {

    public int solution(int[] A) {
        int numberOfPairs = 0;
        int counterOfZeros = 0;
        for (int i = 0; i <= A.length - 1; i++) {
            if (A[i] == 1) {
                numberOfPairs = counterOfZeros + numberOfPairs;
                if (numberOfPairs > 1000000000) return -1;
            } else {
                counterOfZeros++;
            }
        }
        return numberOfPairs;
    }

    //solution2 to check when will be more than 1000000000 pairs
    public int solution2(List<Integer> list) {
        int numberOfPairs = 0;
        int counterOfZeros = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == 1) {
                numberOfPairs = counterOfZeros + numberOfPairs;
                if (numberOfPairs > 1000000000) return -1;
            } else {
                counterOfZeros++;
            }
        }
        return numberOfPairs;
    }
}
