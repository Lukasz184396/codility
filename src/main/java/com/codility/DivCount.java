package com.codility;

public class DivCount {
    public static void main(String[] args) {
        int divCount = divCount(4, 17, 3);
        System.out.println(divCount); //4
        int divCount2 = divCount(6, 11, 2);
        System.out.println(divCount2); //3
    }
    public static int divCount (int a, int b, int k) {
        int beginMultiplier = a / k;
        int endMultiplier = b / k;

        if(beginMultiplier * k < a) {
            beginMultiplier++;
        }
        if(endMultiplier * k > b) {
            endMultiplier--;
        }
        return (endMultiplier - beginMultiplier) +1;

    }
}
