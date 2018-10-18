package com.codility;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinAvgTwoSliceTest {

    @Test
    public void shouldReturnOne() {
        int[] A = {4,2,2,5,1,8};
        assertEquals(1,new MinAvgTwoSlice().solution(A));
    }
}
