package com.codility.recruitment;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean areWordsAnagrams(String givenWord, String checkedWord) {
        if (isAnyWordNull(givenWord, checkedWord) ||
                isAnyWordEmptyString(givenWord, checkedWord) ||
                isDifferentLengthOfWords(givenWord, checkedWord)) {
            return false;
        }

        Map<Character, Integer> givenWordCountedOccurrencesOfCharacters = new HashMap();
        Map<Character, Integer> checkedWordCountedOccurrencesOfCharacters = new HashMap();
        countCharsInString(givenWord, givenWordCountedOccurrencesOfCharacters);
        countCharsInString(checkedWord, checkedWordCountedOccurrencesOfCharacters);

        if (givenWordCountedOccurrencesOfCharacters.equals(checkedWordCountedOccurrencesOfCharacters)) return true;
        else return false;
    }

    private boolean isDifferentLengthOfWords(String givenWord, String checkedWord) {
        return givenWord.length() != checkedWord.length();
    }

    private boolean isAnyWordEmptyString(String givenWord, String checkedWord) {
        return givenWord.equals("") || checkedWord.equals("");
    }

    private boolean isAnyWordNull(String givenWord, String checkedWord) {
        return givenWord == null || checkedWord == null;
    }

    private void countCharsInString(String givenWord, Map<Character, Integer> wordCountedCharacters) {
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
