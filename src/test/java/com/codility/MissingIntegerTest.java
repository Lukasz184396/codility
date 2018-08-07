package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {
    @Test
    public void shouldReturnFive() {
        int [] array = {1,3,6,4,1,2};
        assertEquals(5,new MissingInteger().solution(array));
    }
    @Test
    public void shouldReturnFour() {
        int [] array = {1,2,3};
        assertEquals(4,new MissingInteger().solution(array));
    }
    @Test
    public void shouldReturnOne() {
        int [] array = {-1,-3};
        assertEquals(1, new MissingInteger().solution(array));
    }
    @Test
    public void shouldReturnTwo() {
        int [] array = {1,1,1,1};
        assertEquals(2, new MissingInteger().solution(array));
    }
}
