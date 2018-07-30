package com.codility;

public class FrogJmp {

    int solution(int start, int finish, int jump) {
        int position = start;
        int result = (finish-start)/jump;
        position = position + result * jump;
        if(position<finish) result++;
        return result;
    }
}
