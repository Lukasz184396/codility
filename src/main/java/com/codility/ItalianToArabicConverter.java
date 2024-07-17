package com.codility;

import java.util.HashMap;
import java.util.Map;

public class ItalianToArabicConverter {

    static Map<Character,Integer> italianToArabicNumberMap = new HashMap<>();

    static {
        italianToArabicNumberMap.put('I', 1);
        italianToArabicNumberMap.put('V', 5);
        italianToArabicNumberMap.put('X', 10);
        italianToArabicNumberMap.put('L', 50);
        italianToArabicNumberMap.put('C', 100);
        italianToArabicNumberMap.put('D', 500);
        italianToArabicNumberMap.put('M', 1000);
    }

    public static void main(String[] args) {

        System.out.println(convert("I")); //1
        System.out.println(convert("IV")); //4
        System.out.println(convert("XVI")); //16
        System.out.println(convert("LIX")); //59
        System.out.println(convert("DCCC")); //800
        System.out.println(convert("MLX")); //1060
        System.out.println(convert("MMM")); //3000
        System.out.println(convert("MCLIV")); //800

    }
    public static int convert(String string) {
        int sum = 0;
        int previousValue = 0;
        for (int i = string.length()-1; i >=  0 ; i--) {
            char currentItalianCharacter = string.charAt(i);
            int currentValue = italianToArabicNumberMap.get(currentItalianCharacter);
            if(currentValue < previousValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
            previousValue = currentValue;
        }

        return sum;
    }
}
