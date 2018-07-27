package com.codility;

public class OddOccurrencesInArray {

    public int solution(int[] array) {
        int elementForXORComparation = 0;
        for (int i = 0; i < array.length; i++) {
            elementForXORComparation ^= array[i];
        }
        return elementForXORComparation;
    }
}
