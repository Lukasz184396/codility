package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {

    @Test
    public void shouldReturnThree() {
        int start = 10;
        int finish = 85;
        int jump = 30;
        assertEquals(3, new  FrogJmp().solution(start, finish,jump));
    }
}
