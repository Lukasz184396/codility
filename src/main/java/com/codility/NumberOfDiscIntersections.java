package com.codility;

public class NumberOfDiscIntersections {
    // Task Score 62% - Correctness 100% and Performance 25%
    public int solution(int[] A) {
        int counter = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if ((long) i + A[i] >= j - (long) A[j]) {
                    counter++;
                    if (counter > 10_000_000)
                        return -1;
                }
            }
        }
        return counter;
    }

    //    //in my opinion this is proper version
//    public int solution2(int[] A) {
//        int counter = 0;
//        for (int i = 0; i < A.length - 1; i++) {
//            for (int j = i + 1; j < A.length; j++) {
//                if ((long) i + A[i] >= j - (long) A[j] && (long) i -A[i]<=j - (long) A[j] ) {
//                    counter++;
//                    if (counter > 10_000_000)
//                        return -1;
//                }
//            }
//        }
//        return counter;
//    }
}
