package edu.asu.stratego.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.BattleOutcome;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

public class SpecialUnitTest 
{
	

	/**
	 * exhaustive testing for spy attacks
	 */
	Piece rSpy, bSpy, bScout, rScout, bSarge, rSarge, bLT, rLT, bCpt, rCpt, bMajor, 
	rMajor, bCol, rCol,	bGnrl, rGnrl, bMarsh, rMarsh, bMiner, rMiner, bBomb, rBomb;

	
	BattleOutcome result; 

	@Before
	public void setUp() throws Exception 
		{
		rSpy = new Piece(PieceType.SPY, PieceColor.RED, false);
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
		bBomb = new Piece(PieceType.BOMB, PieceColor.BLUE, true);
		
		rScout = new Piece(PieceType.SCOUT, PieceColor.RED, true);
		rMiner = new Piece(PieceType.MINER, PieceColor.RED, true);
		rSarge = new Piece(PieceType.SERGEANT, PieceColor.RED, true);
		rLT = new Piece(PieceType.LIEUTENANT, PieceColor.RED, true);
		rCpt = new Piece(PieceType.CAPTAIN, PieceColor.RED, true);
		rMajor = new Piece(PieceType.MAJOR, PieceColor.RED, true);
		rCol = new Piece(PieceType.COLONEL, PieceColor.RED, true);
		rGnrl = new Piece(PieceType.GENERAL, PieceColor.RED, true);
		rMarsh = new Piece(PieceType.MARSHAL, PieceColor.RED, true);
		rBomb = new Piece(PieceType.BOMB, PieceColor.RED, true);
		
		}

	@After
	public void tearDown() throws Exception 
		{
		rSpy = null;	bSpy = null;	bMiner = null;	bSarge = null;	bLT = null;
		bCpt = null;	bMajor = null;	bCol = null;	bGnrl = null;	bMarsh = null;
		bBomb = null;	rScout = null;	rMiner = null;	rSarge = null;	rLT = null;
		rCpt = null;	rMajor = null;	rCol = null;	rGnrl = null;	rMarsh = null;
		rBomb = null;
		
		}

	@Test
	public void test() 
		{
		
		//Testing for Blue Spy attacking any red piece. Spy should lose
		
		//Spy attacks spy
		result = rSpy.getPieceType().attack(bSpy.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Scout
		result = rSpy.getPieceType().attack(bScout.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Miner
		result = rSpy.getPieceType().attack(bMiner.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Sergeant
		result = rSpy.getPieceType().attack(bSarge.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Lieutenant
		result = rSpy.getPieceType().attack(bLT.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Captain
		result = rSpy.getPieceType().attack(bCpt.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Major
		result = rSpy.getPieceType().attack(bMajor.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Colonel
		result = rSpy.getPieceType().attack(bCol.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks bomb
		result = rSpy.getPieceType().attack(bBomb.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		
		//Testing for Red Spy to attack any blue piece. Spy should lose.
		
		//Spy attacks Spy
		result = bSpy.getPieceType().attack(rSpy.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Scout
		result = bSpy.getPieceType().attack(rScout.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Miner
		result = bSpy.getPieceType().attack(rMiner.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Sergeant
		result = bSpy.getPieceType().attack(rSarge.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Lieutenant
		result = bSpy.getPieceType().attack(rLT.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Captain
		result = bSpy.getPieceType().attack(rCpt.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Major
		result = bSpy.getPieceType().attack(rMajor.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks Colonel
		result = bSpy.getPieceType().attack(rCol.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		
		//Spy attacks bomb
		result = bSpy.getPieceType().attack(rBomb.getPieceType());
		assertFalse(result == BattleOutcome.WIN);
		 
		//Spy attacking the Marshal. Spy should win this battle.
		
		//Spy attacks Marshal
		result = bSpy.getPieceType().attack(rMarsh.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		result = rSpy.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		
	}

}