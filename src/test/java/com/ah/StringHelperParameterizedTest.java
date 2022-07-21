package com.ah;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * 1.  Set up annotation at class level
 * 2.  Set up input output params in a collection
 * 3.  Set up constructor, store params locally
 */


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper stringHelper = new StringHelper();

    private String input;
    private String expected;

    public StringHelperParameterizedTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutputs = {
                {"AACD", "CD"},
                {"ACD", "CD"},
                {"AAXY", "XY"},
                {"XY", "XY"},
                {"XYZ", "XYZ"},
                {"AA", ""}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    @DisplayName("Checking that all parameters are passed to the test")
    public void checkTruncateAInFirstTwoLetters() {
        Assertions.assertEquals(expected, stringHelper.truncateAinFirstTwoLetters(input));
    }

}
