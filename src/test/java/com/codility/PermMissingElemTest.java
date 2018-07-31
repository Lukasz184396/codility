package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    @Test
    public void shouldReturnThree() {

        int [] array = {2,3,1,5};
        assertEquals(4, new  PermMissingElem().solution(array));

    }
}
