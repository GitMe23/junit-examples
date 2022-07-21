package com.ah;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class PerformanceTest {

    @Test(timeout = 100)
    @DisplayName("Checking performance")
    public void testSortPerformance() {
        int[] array = {12, 23, 4};
        for (int i = 1; i <= 1000000; i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }


}
