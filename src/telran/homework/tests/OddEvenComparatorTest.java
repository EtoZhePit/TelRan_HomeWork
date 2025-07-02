package telran.homework.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.homework.controller.Main;
import telran.homework.controller.OddEvenComparator;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class OddEvenComparatorTest {
    Integer[] intArr;


    @BeforeEach
    void setUp() {
        intArr = new Integer[] {1,2,3,4,5,6,7,8,9,3};
    }

    @Test
    void TestCompare() {
        Integer[] origin = {1,2,3,4,5,6,7,8,9,3};
        Integer[] expected = {2,4,6,8,9,7,5,3,3,1};
        Main.bubbleSort(origin, new OddEvenComparator());
        assertEquals(Arrays.toString(expected), Arrays.toString(origin));
    }


}
