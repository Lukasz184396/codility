package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NestingTest {

    @Test
    public void shouldReturnOmeForEmptyString() {
        assertEquals(1,new Nesting().solution(""));
    }

    @Test
    public void shouldReturnZeroForBadNestedString() {
        assertEquals(0,new Nesting().solution("())"));
    }

    @Test
    public void shouldReturnOneForGoodNestedString() {
        assertEquals(1,new Nesting().solution("(()(())())"));
    }
    @Test
    public void shouldReturnOneForGoodNestedStringOnlyOpenAndCloseRoundBrackets() {
        assertEquals(1,new Nesting().solution("()"));
    }
}
