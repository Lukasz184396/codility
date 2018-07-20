package com.codility;

import java.util.stream.Stream;

public class BinaryGap {

    public int solution(int integerNumber) {
        return Stream
                .of(Integer.toBinaryString(integerNumber)
                .replaceAll("0+$", "")
                .split("1+"))
                .filter(a -> a != null)
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);
    }
}
