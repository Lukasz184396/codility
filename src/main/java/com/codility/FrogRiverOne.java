package com.codility;

import java.util.ArrayList;
import java.util.List;

public class FrogRiverOne {
    public int solution(int X, int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < X; i++) {
            list.add(i+1);
        }
        for (int i = 0; i < array.length; i++) {
            list.remove(Integer.valueOf(array[i]));
            if(list.isEmpty()) return i;
        }
        return -1;
    }
}
