package edu.asu.stratego.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.Player;

public class TestPlayer {
	
	/** Player class that will be tested */
	private Player player;
	
	@Before
	public void setUp() {
		player = new Player();
	}
	
	@After
	public void tearDown() {
		player = null;
	}

	@Test
	public void testPlayerNickname() {
		
		// Players nickname should equal this value
		String playerNickname = "Player Name";
		player.setNickname(playerNickname);
		assertTrue(player.getNickname().equals(playerNickname));
	}
	
	@Test
	public void testPlayerColorRed() {
		player = new Player();
		player.setColor(PieceColor.RED);
	}
	
	@Test
	public void testPlayerColorBlue() {
		player = new Player();
		player.setColor(PieceColor.BLUE);
	}

}
