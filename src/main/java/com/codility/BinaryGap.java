package com.codility;

public class BinaryGap {

    public int solution(int integerNumber) {
        int longestBinaryGap = 0;
        int numberElementToCheck;
        String[] tab;
        String binaryNumberString = Integer.toBinaryString(integerNumber);
        if (binaryNumberString.charAt(binaryNumberString.length() - 1) == '0') {
            tab = binaryNumberString.split("1");
            numberElementToCheck = tab.length - 1;
        } else {
            tab = binaryNumberString.split("1");
            numberElementToCheck = tab.length;
        }
        for (int i = 0; i < numberElementToCheck; i++) {
            int tempLongestBinaryGap = tab[i].length();
            if (tempLongestBinaryGap > longestBinaryGap)
                longestBinaryGap = tempLongestBinaryGap;
        }
        return longestBinaryGap;
    }
}
