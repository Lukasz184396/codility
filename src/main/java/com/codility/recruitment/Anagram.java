package com.codility.recruitment;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isWordAnagram(String givenWord, String checkedWord) {
        if(givenWord == null || givenWord.equals("") || givenWord.length() != checkedWord.length()) return false;

        Map<Character, Integer> givenWordCountedCharacters = new HashMap();
        Map<Character, Integer> checkedWordCountedCharacters = new HashMap();
        countCharsInString(givenWord, givenWordCountedCharacters);
        countCharsInString(checkedWord, checkedWordCountedCharacters );

        if(givenWordCountedCharacters.equals(checkedWordCountedCharacters)) return true;
        else return false;
    }

    private void countCharsInString(String givenWord, Map<Character, Integer> wordCountedCharacters) {
        for (int i = 0; i < givenWord.length(); i++) {
            if(wordCountedCharacters.containsKey(Character.valueOf(givenWord.charAt(i)))) {
                Integer specificCharCounter =
                        wordCountedCharacters.get(Character.valueOf(givenWord.charAt(i))) + 1;
                wordCountedCharacters.put(Character.valueOf(givenWord.charAt(i)),
                        specificCharCounter);
            } else {
                wordCountedCharacters.put(Character.valueOf(givenWord.charAt(i)), 1);
            }
        }
    }
}
