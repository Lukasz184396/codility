package com.codility;

public class FrogJmp {

    int solution(int start, int finish, int jump) {
        int result = 0;
        int position = start;
        result = (finish-start)/jump;
        position = position + result * jump;
        if(position<finish) result++;
        return result;
    }
}
