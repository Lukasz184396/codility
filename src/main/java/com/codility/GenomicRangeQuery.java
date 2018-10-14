package com.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] minImpactFactors = new int[P.length];
        String[] tab = new String[P.length];
        for (int i = 0; i < P.length; i++) {
            tab[i] = S.substring(P[i], Q[i] + 1);
            minImpactFactors[i] = Collections.min(convertCodeToImpactFactors(tab[i]));
        }
        return minImpactFactors;
    }

    //Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4
    private static List<Integer> convertCodeToImpactFactors(String code) {
        List<Integer> impactFactors = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case 'A':
                    impactFactors.add(1);
                    break;
                case 'C':
                    impactFactors.add(2);
                    break;
                case 'G':
                    impactFactors.add(3);
                    break;
                case 'T':
                    impactFactors.add(4);
                    break;
            }
        }
        return impactFactors;
    }
}
