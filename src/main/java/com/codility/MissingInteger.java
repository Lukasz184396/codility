package com.codility;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] array) {
        int smallestIntegerNotOccuringInArray = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] < smallestIntegerNotOccuringInArray);
                else if(array[i] == smallestIntegerNotOccuringInArray) {
                smallestIntegerNotOccuringInArray++;
            }
        }
        return smallestIntegerNotOccuringInArray;
    }
}
