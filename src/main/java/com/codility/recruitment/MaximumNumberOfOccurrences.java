package com.codility.recruitment;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfOccurrences {

    public static int findMostPopularNumber(int [] array) {
        if(array == null || array.length == 0) throw new RuntimeException("There is no number in array");
        int result = array[0];
        if(array.length==1) return result;

        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            int key = array[i];
            if(map.containsKey(key))
            {
                int occurrences = map.get(key);
                occurrences++;
                map.put(key, occurrences);
            } else {
                map.put(key, 1);
            }
        }
        for(Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (maxCount < val.getValue()) {
                result = val.getKey();
                maxCount = val.getValue();
            }
        }
        return result;
    }

}