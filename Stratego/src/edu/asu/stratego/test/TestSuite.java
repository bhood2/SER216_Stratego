/*
 * NAME: Michael Hodges
 * PID: A12653260
 * LOGIN: CS12WHH
 */
package edu.asu.stratego.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GameUnitTests.class, SpecialUnitTest.class, BombTest.class, ServerGameManagerTest.class,
	ClientGameManagerTest.class})
public class TestSuite {

}