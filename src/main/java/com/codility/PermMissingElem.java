package com.codility;

public class PermMissingElem {
    public int solution(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int sumOfNaturalNumbers = (array.length+1) * (array.length +2) / 2;
        return sumOfNaturalNumbers - sum;
    }
}
