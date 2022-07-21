package com.ah;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();


//    Checking that first two letters are truncated if A
    @Test
    @DisplayName("Check Stringhelper works ")
    public void testStringHelper() {
        Assertions.assertEquals("CD", stringHelper.truncateAinFirstTwoLetters("AACD"));
    }

//    COMPARING ARRAYS
    @Test
    @DisplayName("Testing array equality")
    public void testArrayComparison(){
        int[] randomArray = {12, 4, 3, 1};
        int[] expected = {1,3,4,12};
        Arrays.sort(randomArray);
        Assertions.assertArrayEquals(expected, randomArray);
    }

//    TESTING FOR EXCEPTION THROWN
    @Test(expected = NullPointerException.class)
    @DisplayName("Checking test passes if NullPointerException thrown")
    public void testNullPointerException() {
        int[] arrayWithNull = null;
        Arrays.sort(arrayWithNull);
    }


}
