package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void shouldReturnTwo()
    {
        assertEquals(2, new  BinaryGap().solution(9));
    }

    @Test
    public void shouldReturnFour()
    {
        assertEquals(4, new  BinaryGap().solution(529));
    }

    @Test
    public void shouldReturnOne()
    {
        assertEquals(1, new  BinaryGap().solution(20));
    }

    @Test
    public void shouldReturnZero()
    {
        //assertEquals(0, new  BinaryGap().solution(15));
        assertEquals(0, new  BinaryGap().solution(32));
    }

    @Test
    public void shouldReturnFive()
    {
        assertEquals(5, new  BinaryGap().solution(1041));
    }

}