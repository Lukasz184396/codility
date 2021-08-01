package com.codility.recruitment;

import org.junit.Test;

import static org.junit.Assert.*;


public class MaximumNumberOfOccurrencesTest {

    @Test
    public void shouldReturnTrueIfWordsAreAnagramsOfEachOthers () {
        //given
        int [] numbers = new int[] {2,6,1,11,11,5,5,5,5,5,5};

        //when
        int found = MaximumNumberOfOccurrences.findMostPopularNumber(numbers);

        //then
        assertEquals(5, found);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowException () {
        //given
        int [] numbers = new int[] {};

        //when
        int found = MaximumNumberOfOccurrences.findMostPopularNumber(numbers);

    }

}