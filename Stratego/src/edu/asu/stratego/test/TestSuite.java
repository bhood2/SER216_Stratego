package edu.asu.stratego.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestSetupBoard.class, TestGame.class, TestPlayer.class, 
	GameUnitTests.class, SpecialUnitTest.class, BombTest.class, TestMove.class, 
	ServerGameManagerTest.class, ClientGameManagerTest.class})
public class TestSuite {}