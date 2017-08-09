package edu.asu.stratego.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import edu.asu.stratego.game.Game;
import edu.asu.stratego.game.GameStatus;
import edu.asu.stratego.game.Move;
import edu.asu.stratego.game.MoveStatus;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.Player;
import edu.asu.stratego.game.board.ClientBoard;

public class TestGame {
	
	/** Player & opponent used for testing */
	private Player player, opponent;
		
	@Before
	public void setUp() {
		
		player = new Player();
		player.setColor(PieceColor.RED);
		player.setNickname("Gandalf");
		
		opponent = new Player();
		opponent.setColor(PieceColor.BLUE);
		opponent.setNickname("Sam");
	}
	
	@After
	public void tearDown() {
		player = null;
		opponent = null;
	}
	
	@Test
	public void testPlayer() {
		
		// Set the player & verify that they match
		Game.setPlayer(player);
		assertEquals(Game.getPlayer(), player);
		
	}
	
	@Test
	public void testOpponent() {
		
		// Set the player's opponent & verify that they match
		Game.setOpponent(opponent);
		assertEquals(Game.getOpponent(), opponent);
		
	}
	
	@Test
	public void testGameStatus() {
		GameStatus testStatus = GameStatus.IN_PROGRESS;
		Game.setStatus(testStatus);
		assertEquals(Game.getStatus(), testStatus);
		
	}
	
	@Test
	public void testGameTurn() {
		PieceColor turnColor = PieceColor.RED;
		Game.setTurn(turnColor);
		assertEquals(Game.getTurn(), turnColor);
	}
	
	@Test
	public void testMove() {
		Move move = new Move();
		Game.setMove(move);
		assertEquals(Game.getMove(), move);
	}
	
	@Test
	public void testMoveStatus() {
		MoveStatus moveStatus = MoveStatus.START_SELECTED;
		Game.setMoveStatus(moveStatus);
		assertEquals(Game.getMoveStatus(), moveStatus);
	}
}