package edu.asu.stratego.test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.Move;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

public class TestMove {
	
	/** Move class that's being tested */
	private Move move;
	
	/** Initial points used for testing */
	Point start = new Point(-1, -1), end = new Point(-1, -1);
	
	@Before
	public void setUp() {
		move = new Move();
		move.setStart(start);
		move.setEnd(end);
	}
	
	@After
	public void tearDown() {
		move = null;
	}

	@Test
	public void testAttackMove() {
		boolean isAttackMove = false;
		move.setAttackMove(isAttackMove);
		assertEquals(move.isAttackMove(), false);
	}

	@Test
	public void testStart() {
		assertEquals(move.getStart(), start);		
	}
	
	@Test
	public void testStartOverload() {
		int x = 0, y = 0;
		move.setStart(x, y);
		assertEquals(move.getStart(), new Point(x, y));
	}
	
	@Test
	public void testEnd() {
		int x = 0, y = 0;
		move.setEnd(x, y);
		assertEquals(move.getEnd(), new Point(x, y));
	}
	
	@Test
	public void testMoveColorBlue() {
		PieceColor pieceColor = PieceColor.BLUE;
		move.setMoveColor(pieceColor);
		assertEquals(move.getMoveColor(), pieceColor);
	}
	
	@Test
	public void testMoveColorRed() {
		PieceColor pieceColor = PieceColor.RED;
		move.setMoveColor(pieceColor);
		assertEquals(move.getMoveColor(), pieceColor);
	}
	
	@Test
	public void testIsPieceSelected() {
		move.setStart(0, 0);
		assertEquals(move.isPieceSelected(), true);
	}
	
	@Test
	public void testIsPieceNotSelected() {
		assertEquals(move.isPieceSelected(), false);
	}
	
	@Test
	public void testStartPiece() {
		Piece piece = new Piece(PieceType.SCOUT, PieceColor.BLUE, false);
		move.setStartPiece(piece);
		assertEquals(move.getStartPiece(), piece);
	}
}
