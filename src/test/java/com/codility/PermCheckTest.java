package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
    @Test
    public void shouldReturnOne() {
        int [] array = {4,1,3,2};
        assertEquals(1, new  PermCheck().solution(array));
    }

    @Test
    public void shouldReturnZero() {
        int [] array = {4,1,3};
        assertEquals(0, new  PermCheck().solution(array));
    }

}
