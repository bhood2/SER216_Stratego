package edu.asu.stratego.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.BattleOutcome;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

/*
 * Exhaustive bomb testing
 */
public class BombTest {
	
		
		//Pieces
	Piece rSpy, bSpy, bScout, rScout, bSarge, rSarge, bLT, rLT, bCpt, rCpt, bMajor, 
	rMajor, bCol, rCol,	bGnrl, rGnrl, bMarsh, rMarsh, bMiner, rMiner, bomb;
		
		BattleOutcome outcome;


	@Before
	public void setUp() throws Exception 
		{
		
		//Create blue pieces
		bSpy = new Piece(PieceType.SPY, PieceColor.BLUE, true);
		bScout = new Piece(PieceType.SCOUT, PieceColor.BLUE, true);
		bMiner = new Piece(PieceType.MINER, PieceColor.BLUE, true);
		bSarge = new Piece(PieceType.SERGEANT, PieceColor.BLUE, true);
		bLT = new Piece(PieceType.LIEUTENANT, PieceColor.BLUE, true);
		bCpt = new Piece(PieceType.CAPTAIN, PieceColor.BLUE, true);
		bMajor = new Piece(PieceType.MAJOR, PieceColor.BLUE, true);
		bCol = new Piece(PieceType.COLONEL, PieceColor.BLUE, true);
		bGnrl = new Piece(PieceType.GENERAL, PieceColor.BLUE, true);
		bMarsh = new Piece(PieceType.MARSHAL, PieceColor.BLUE, true);
		
		//Create red pieces
		rSpy = new Piece(PieceType.SPY, PieceColor.RED, false);
		rScout = new Piece(PieceType.SCOUT, PieceColor.RED, true);
		rMiner = new Piece(PieceType.MINER, PieceColor.RED, true);
		rSarge = new Piece(PieceType.SERGEANT, PieceColor.RED, true);
		rLT = new Piece(PieceType.LIEUTENANT, PieceColor.RED, true);
		rCpt = new Piece(PieceType.CAPTAIN, PieceColor.RED, true);
		rMajor = new Piece(PieceType.MAJOR, PieceColor.RED, true);
		rCol = new Piece(PieceType.COLONEL, PieceColor.RED, true);
		rGnrl = new Piece(PieceType.GENERAL, PieceColor.RED, true);
		rMarsh = new Piece(PieceType.MARSHAL, PieceColor.RED, true);
		
		//Create Bomb piece
		bomb = new Piece(PieceType.BOMB, PieceColor.BLUE, true);
		
	}

	@After
	public void tearDown() throws Exception 
		{
		//Clears all pieces	
		rSpy = null;bSpy = null; bMiner = null;	bSarge = null;	bLT = null;	bCpt = null; bMajor = null;
		bCol = null; bGnrl = null; bMarsh = null; rScout = null; rMiner = null; rSarge = null; rLT = null;
		rCpt = null; rMajor = null; rCol = null; rGnrl = null;	rMarsh = null;
		
		}

	@Test
	public void test() {
		
		//Spy attacks bomb and loses
		outcome = rSpy.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Scout attacks bomb and loses
		outcome = rScout.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Sergeant attacks bomb and loses
		outcome = rSarge.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacks bomb and loses
		outcome = rLT.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Captain
		outcome = rCpt.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Major
		outcome = rMajor.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Colonel
		outcome = rCol.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//General
		outcome = rGnrl.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Marshal
		outcome = rMarsh.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Miner attacks bomb and wins
		outcome = rMiner.getPieceType().attack(bomb.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Blue pieces
		
		bomb = new Piece(PieceType.BOMB, PieceColor.RED, true);

		
		//Spy attacks bomb and loses
		outcome = bSpy.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Scout attacks bomb and loses
		outcome = bScout.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Sergeant attacks bomb and loses
		outcome = bSarge.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacks bomb and loses
		outcome = bLT.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Captain
		outcome = bCpt.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Major
		outcome = bMajor.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Colonel
		outcome = bCol.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//General
		outcome = bGnrl.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Marshal
		outcome = bMarsh.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Miner attacks bomb and wins
		outcome = bMiner.getPieceType().attack(bomb.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		
	}

}