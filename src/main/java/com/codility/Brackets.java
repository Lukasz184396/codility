package com.codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {

        Stack<Character> chars = new Stack<>();
        if(null == S){
            return 0;
        }else if(S.isEmpty()){
            return 1;
        }

        for (Character C : S.toCharArray()) {

            switch (C) {
                case ')':
                    customPop(chars, '(');
                    break;
                case '}':
                    customPop(chars, '{');
                    break;
                case ']':
                    customPop(chars, '[');
                    break;

                default:
                    chars.push(C);
                    break;
            }
        }

        return chars.isEmpty() ? 1 : 0; //condition to pass ([)()]
    }

    private static void customPop(Stack<Character> s, Character  c){
        while(!s.isEmpty() && s.peek() != c){
            s.pop();
        }
        if(!s.isEmpty()){
            s.pop();
        }else{
            s.push(c);
        }
    }
}
