# junit-examples
Example code using JUnit 

I've created this repo to consolidate learning and
refer back to when recalling syntax.

The main java code contains a method that truncates the first two characters of a string if they contain 'A'.

Example:
* Input of "AACD" returns "CD"
* Input of "AA" returns ""
* Input of "BAB" returns "B"

#### Example junit topics

1. **Testing for exceptions**

Check that a test passes if an exception is thrown with the annotation:
```java
@Test(expected = NullPointerException.class)
```

2. **Parameterized tests**

Set up parameterized tests in a new class with class level annotation:
```java
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest
```

Set up parameters in a collection with parameters annotation:
```java
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
```

Create a constructor and store params locally:
```java
    StringHelper stringHelper = new StringHelper();

    private String input;
    private String expected;

    public StringHelperParameterizedTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }
```

Make a single test:
```java
    @Test
    public void checkTruncateAInFirstTwoLetters() {
        Assertions.assertEquals(expected, stringHelper.truncateAinFirstTwoLetters(input));
    }
```
