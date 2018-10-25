package com.codility.recruitment;

import com.google.common.base.Strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean areWordsAnagrams(String givenWord, String checkedWord) {
        if (Strings.isNullOrEmpty(givenWord) ||
                Strings.isNullOrEmpty(checkedWord) ||
                isDifferentLengthOfWords(givenWord, checkedWord)) {
            return false;
        }

        Map<Character, Integer> givenWordCountedOccurrencesOfCharacters = new HashMap();
        Map<Character, Integer> checkedWordCountedOccurrencesOfCharacters = new HashMap();
        countCharsOccurrencesInString(givenWord, givenWordCountedOccurrencesOfCharacters);
        countCharsOccurrencesInString(checkedWord, checkedWordCountedOccurrencesOfCharacters);

        if (givenWordCountedOccurrencesOfCharacters.equals(checkedWordCountedOccurrencesOfCharacters)) return true;
        else return false;
    }

    private boolean isDifferentLengthOfWords(String givenWord, String checkedWord) {
        return givenWord.length() != checkedWord.length();
    }

    private void countCharsOccurrencesInString(String givenWord, Map<Character, Integer> wordCountedCharacters) {
        for (int i = 0; i < givenWord.length(); i++) {
            if (wordCountedCharacters.containsKey(Character.valueOf(givenWord.charAt(i)))) {
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
