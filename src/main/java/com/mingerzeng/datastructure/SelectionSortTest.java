package com.mingerzeng.datastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MingerzengDataStructureApplication.class)
// 如果在根路径下没有application类则需要指定一个application类

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
