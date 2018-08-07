package com.codility;

import java.util.*;

public class MissingInteger {
    public int solution(int[] array) {
        int smallestIntegerNotOccuringInArray = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        Set<Integer> set = new HashSet<>(list);
        Arrays.sort(array);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(it.next() == smallestIntegerNotOccuringInArray) {
                smallestIntegerNotOccuringInArray++;
            }
        }
        return smallestIntegerNotOccuringInArray;
    }
}
