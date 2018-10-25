package com.codility.recruitment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AnagramTest {

    @Test
    public void shouldReturnTrueIfWordsAreAnagramsOfEachOthers () {
        assertTrue("Two phrases are not anagrams each other",new Anagram().areWordsAnagrams("maria", "aarmi"));
    }

    @Test
    public void shouldReturnFalseIfAnyWordIsNull () {
        assertFalse("Two phrases are not anagrams each other",new Anagram().areWordsAnagrams("maria", null));
    }

    @Test
    public void shouldReturnFalseIfIsAnyWordEmptyString () {
        assertFalse("Two phrases are not anagrams each other",new Anagram().areWordsAnagrams("maria", ""));
    }

    @Test
    public void shouldReturnFalseIfIsDifferentLengthOfWords () {
        assertFalse("Two phrases are not anagrams each other",new Anagram().areWordsAnagrams("maria", "mariaa"));
    }
}