package com.codility;

public class FrogJmp {

    int solution(int start, int finish, int jump) {
        int result = 0;
        int positon = start;
        while (positon < finish) {
            positon += jump;
            result++;
        }
        return result;

    }
}
