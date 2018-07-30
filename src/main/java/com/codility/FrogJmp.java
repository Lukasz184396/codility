package com.codility;

public class FrogJmp {

    int solution(int start, int finish, int jump) {
        int result = (finish-start)/jump;
        int position = start + result * jump;
        if(position<finish) result++;
        return result;
    }
}
