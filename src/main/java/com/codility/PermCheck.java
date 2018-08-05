package com.codility;


import java.util.Arrays;

public class PermCheck {
    public int solution(int[] array) {

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] != i+1) return 0;
        }
        return 1;
    }
}
