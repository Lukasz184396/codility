package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

    @Test
    public void shouldReturnOne() {

        int [] array = {3,1,2,4,3};
        assertEquals(1, new  TapeEquilibrium().solution(array));

    }
}
