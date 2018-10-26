package com.codility;

import java.util.Stack;

public class Nesting {
    public int solution(String s) {
        if (s.isEmpty()) return 1;
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')') {
                stack.push(s.charAt(i));
            } else {
                if(stack.size()!=0) {
                    stack.pop();
                } else {
                    return 0;
                }
            }
        }
         return 1;
    }
}
