package edu.asu.stratego.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGame.class, TestPlayer.class, GameUnitTests.class, 
	SpecialUnitTest.class, BombTest.class, ServerGameManagerTest.class,
	ClientGameManagerTest.class})
public class TestSuite {}