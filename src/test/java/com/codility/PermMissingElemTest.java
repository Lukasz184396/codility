package com.codility;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    @Test
    public void shouldReturnFour() {

        int [] array = {2,3,1,5};
        assertEquals(4, new  PermMissingElem().solution(array));

    }

    @Test
    public void shouldReturnFourToo() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6 ; i++) {
            list.add(i);
        }
        System.out.println("list :" + list );
        list.remove(3);

        int [] array = new int[4];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        assertEquals(4, new  PermMissingElem().solution(array));

    }

    @Test
    public void shouldReturnOneHundredThousands() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100002 ; i++) {
            list.add(i);
        }
        //System.out.println("list :" + list );
        list.remove(99999);
        System.out.println(" Mod list :" + list );
        int [] array = new int[100000];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        assertEquals(100000, new  PermMissingElem().solution(array));

    }


}
