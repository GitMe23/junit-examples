package com.ah.testsuites;

import com.ah.AppTest;
import com.ah.StringHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AppTest.class, StringHelperTest.class})

public class SimpleTestSuite {
}
