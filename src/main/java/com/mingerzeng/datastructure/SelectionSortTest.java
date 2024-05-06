package com.mingerzeng.datastructure;

import org.testng.annotations.Test;

public class SelectionSortTest {

    @Test
    void generateUuid_returnsValidUuid() {

        Integer array[] = {3,7,1,8,0,5};
        SelectionSort.sort(array);
        // UUID format: 8-4-4-4-12 hexadecimal characters
        for(int i : array){
            System.out.println(i);
        }
    }
}
