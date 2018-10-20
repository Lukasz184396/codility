package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BracketsTest {
    @Test
    public void shouldReturnProperlyNested() {
        String S = "{[()()]}";
        assertEquals(1, new Brackets().solution(S));
    }

    @Test
    public void shouldReturnBadlyNested() {
        String S = "([)()]";
        assertEquals(0, new Brackets().solution(S));
    }
}
