package com.ah.testsuites;

import com.ah.AppTest;
import com.ah.StringHelperParameterizedTest;
import com.ah.StringHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
* Runs the simple suite as well as param test class, as its own suite
*/
@RunWith(Suite.class)
@Suite.SuiteClasses({SimpleTestSuite.class, StringHelperParameterizedTest.class})
public class ParamterizedSuite {
}
