package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {
    @Test
    public void firsttest() {
        int[] array = {1,3,1, 4, 2, 3, 5, 4};
        assertEquals(6,new FrogRiverOne().solution(5, array ));
    }
}
