package edu.asu.stratego.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.Game;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;
import edu.asu.stratego.game.Player;
import edu.asu.stratego.game.SetupBoard;
import edu.asu.stratego.gui.board.BoardSquareEventPane;

public class TestSetupBoard {
	
	private SetupBoard setupBoard;

	@Before
	public void setUp() throws Exception {
		setupBoard = new SetupBoard();
	}

	@After
	public void tearDown() throws Exception {
		setupBoard = null;
	}

	@Test
	public void testPiece() {
		Piece piece = new Piece(PieceType.CAPTAIN, PieceColor.RED, false);
		int row = 0, col = 0;
		setupBoard.setPiece(piece, row, col);
		assertEquals(setupBoard.getPiece(row, col), piece);
	}

}
