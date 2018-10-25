package com.codility.recruitment;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AnagramTest {

    @Test
    public void shouldGiveAnagramForNonEmptyWord () {

        assertTrue("Two phrases are not anagrams each other",new Anagram().isWordAnagram("maria", "aarmi"));
    }
}