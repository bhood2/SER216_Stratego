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
 * Exhaustive testing of each attack type game piece
 */
public class GameUnitTests 
{

	//Game Pieces
	Piece bScout, rScout, bSarge, rSarge, bLT, rLT, bCpt, rCpt, bMajor, 
	rMajor, bCol, rCol,	bGnrl, rGnrl, bMarsh, rMarsh;
	
	BattleOutcome result;
	
	@Before
	public void setUp() throws Exception 
		{
		
			//create game pieces objects for testing
		
			bScout = new Piece(PieceType.SCOUT, PieceColor.BLUE, false);
			rScout = new Piece(PieceType.SCOUT, PieceColor.RED, true);
		
			bSarge = new Piece(PieceType.SERGEANT, PieceColor.BLUE, false);
			rSarge = new Piece(PieceType.SERGEANT, PieceColor.RED, true);
		
			bLT = new Piece(PieceType.LIEUTENANT, PieceColor.BLUE, false);
			rLT = new Piece(PieceType.LIEUTENANT, PieceColor.RED, true);
		
			bCpt = new Piece(PieceType.CAPTAIN, PieceColor.BLUE, false);
			rCpt = new Piece(PieceType.CAPTAIN, PieceColor.RED, true);
		
			bMajor = new Piece(PieceType.MAJOR, PieceColor.BLUE, false);
			rMajor = new Piece(PieceType.MAJOR, PieceColor.RED, true);
		
			bCol = new Piece(PieceType.COLONEL, PieceColor.BLUE, false);
			rCol = new Piece(PieceType.COLONEL, PieceColor.RED, true);
		
			bGnrl = new Piece(PieceType.GENERAL, PieceColor.BLUE, false);
			rGnrl = new Piece(PieceType.GENERAL, PieceColor.RED, true);
			
			bMarsh = new Piece(PieceType.MARSHAL, PieceColor.BLUE, false);
			rMarsh = new Piece(PieceType.MARSHAL, PieceColor.RED, true);
		}

	@After
	public void tearDown() throws Exception 
		{
			//clears out all the pieces
			bScout = null;	rScout = null;	bSarge = null;	rSarge = null;	bLT = null;	rLT = null;		
			bCpt = null;	rCpt = null;	bMajor = null;	rMajor = null;	bCol = null;	rCol = null;
			bGnrl = null;	rGnrl = null;	bMarsh = null;	rMarsh = null;
		}
	
	@Test
	public void scoutTest() 
		{
		
			//Scout attacking enemy Scout
			result = bScout.getPieceType().attack(rScout.getPieceType());
			assertTrue(result == BattleOutcome.DRAW);
			//Scout attacking player
			result = rScout.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.DRAW);
		
			//Scout attacking enemy Sergeant
			result = bScout.getPieceType().attack(rSarge.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Sergeant attacking player
			result = rSarge.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Lieutenant
			result = bScout.getPieceType().attack(rLT.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Lieutenant attacking player 
			result = rLT.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Captain
			result = bScout.getPieceType().attack(rCpt.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Captain attacking player 
			result = rCpt.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Major
			result = bScout.getPieceType().attack(rMajor.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Major attacking player 
			result = rMajor.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Colonel
			result = bScout.getPieceType().attack(rCol.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Colonel attacking player 
			result = rCol.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy General
			result = bScout.getPieceType().attack(rGnrl.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//General attacking player 
			result = rGnrl.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Marshal
			result = bScout.getPieceType().attack(rMarsh.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Marshal attacking player 
			result = rMarsh.getPieceType().attack(bScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
	}

	@Test
	public void sergeantTest() 
		{
		
			//Scout attacking enemy Sergeant
			result = bSarge.getPieceType().attack(rScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
			//Scout attacking player
			result = rScout.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
		
			//Sergeant attacking enemy Sergeant
			result = bSarge.getPieceType().attack(rSarge.getPieceType());
			assertTrue(result == BattleOutcome.DRAW);
			//Sergeant attacking player
			result = rSarge.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.DRAW);
		
			//Sergeant attacking enemy Lieutenant
			result = bSarge.getPieceType().attack(rLT.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Lieutenant attacking player 
			result = rLT.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Captain
			result = bSarge.getPieceType().attack(rCpt.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Captain attacking player 
			result = rCpt.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Major
			result = bSarge.getPieceType().attack(rMajor.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Major attacking player 
			result = rMajor.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Colonel
			result = bSarge.getPieceType().attack(rCol.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Colonel attacking player 
			result = rCol.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy General
			result = bSarge.getPieceType().attack(rGnrl.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//General attacking player 
			result = rGnrl.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Sergeant attacking enemy Marshal
			result = bSarge.getPieceType().attack(rMarsh.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Marshal attacking player 
			result = rMarsh.getPieceType().attack(bSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		}
	
	@Test
	public void lieutenantTest() 
		{
		
			//Lieutenant attacking enemy Sergeant
			result = bLT.getPieceType().attack(rScout.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
			//Scout attacking player
			result = rScout.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
		
			//Lieutenant attacking enemy Sergeant
			result = bLT.getPieceType().attack(rSarge.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
			//Lieutenant attacking player
			result = rSarge.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
		
			//Lieutenant attacking enemy Lieutenant
			result = bLT.getPieceType().attack(rLT.getPieceType());
			assertTrue(result == BattleOutcome.DRAW);
			//Lieutenant attacking player 
			result = rLT.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.DRAW);
		
			//Lieutenant attacking enemy Captain
			result = bLT.getPieceType().attack(rCpt.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Captain attacking player 
			result = rCpt.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Lieutenant attacking enemy Major
			result = bLT.getPieceType().attack(rMajor.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Major attacking player 
			result = rMajor.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Lieutenant attacking enemy Colonel
			result = bLT.getPieceType().attack(rCol.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Colonel attacking player 
			result = rCol.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Lieutenant attacking enemy General
			result = bLT.getPieceType().attack(rGnrl.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//General attacking player 
			result = rGnrl.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		
			//Lieutenant attacking enemy Marshal
			result = bLT.getPieceType().attack(rMarsh.getPieceType());
			assertTrue(result == BattleOutcome.LOSE);
			//Marshal attacking player 
			result = rMarsh.getPieceType().attack(bLT.getPieceType());
			assertTrue(result == BattleOutcome.WIN);
		}

	@Test
	public void captainTest() 
		{
		
		//Lieutenant attacking enemy Sergeant
		result = bCpt.getPieceType().attack(rScout.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Scout attacking player
		result = rScout.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Captain attacking enemy Sergeant
		result = bCpt.getPieceType().attack(rSarge.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Sergeny attacking player
		result = rSarge.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Captain attacking enemy Lieutenant
		result = bCpt.getPieceType().attack(rLT.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Lieutenant attacking player 
		result = rLT.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Captain attacking enemy Captain
		result = bCpt.getPieceType().attack(rCpt.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		//Captain attacking player 
		result = rCpt.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		
		//Captain attacking enemy Major
		result = bCpt.getPieceType().attack(rMajor.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Major attacking player 
		result = rMajor.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		//Captain attacking enemy Colonel
		result = bCpt.getPieceType().attack(rCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Colonel attacking player 
		result = rCol.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		//Captain attacking enemy General
		result = bCpt.getPieceType().attack(rGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//General attacking player 
		result = rGnrl.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		//Captain attacking enemy Marshal
		result = bCpt.getPieceType().attack(rMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Marshal attacking player 
		result = rMarsh.getPieceType().attack(bCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
	}
	
	@Test
	public void majorTest() 
		{
		
		//Major attacking enemy Sergeant
		result = bMajor.getPieceType().attack(rScout.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Scout attacking player
		result = rScout.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Major attacking enemy Sergeant
		result = bMajor.getPieceType().attack(rSarge.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Sergeant attacking player
		result = rSarge.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Major attacking enemy Lieutenant
		result = bMajor.getPieceType().attack(rLT.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Lieutenant attacking player 
		result = rLT.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Major attacking enemy Captain
		result = bMajor.getPieceType().attack(rCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Captain attacking player 
		result = rCpt.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Major attacking enemy Major
		result = bMajor.getPieceType().attack(rMajor.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		//Major attacking player 
		result = rMajor.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		
		//Major attacking enemy Colonel
		result = bMajor.getPieceType().attack(rCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Colonel attacking player 
		result = rCol.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		//Major attacking enemy General
		result = bMajor.getPieceType().attack(rGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//General attacking player 
		result = rGnrl.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		//Major attacking enemy Marshal
		result = bMajor.getPieceType().attack(rMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Marshal attacking player 
		result = rMarsh.getPieceType().attack(bMajor.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
	}
	
	@Test
	public void colonelTest() {
		
		//Colonel attacking enemy Sergeant
		result = bCol.getPieceType().attack(rScout.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Scout attacking player
		result = rScout.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Sergeant
		result = bCol.getPieceType().attack(rSarge.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Sergeant attacking player
		result = rSarge.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Lieutenant
		result = bCol.getPieceType().attack(rLT.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Lieutenant attacking player 
		result = rLT.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Captain
		result = bCol.getPieceType().attack(rCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Captain attacking player 
		result = rCpt.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Major
		result = bCol.getPieceType().attack(rMajor.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Major attacking player 
		result = rMajor.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Colonel
		result = bCol.getPieceType().attack(rCol.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		//Colonel attacking player 
		result = rCol.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		
		//Colonel attacking enemy General
		result = bCol.getPieceType().attack(rGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//General attacking player 
		result = rGnrl.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		
		//Colonel attacking enemy Marshal
		result = bCol.getPieceType().attack(rMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Marshal attacking player 
		result = rMarsh.getPieceType().attack(bCol.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
	}
	
	@Test
	public void generalTest() 
		{
		
		//General attacking enemy Sergeant
		result = bGnrl.getPieceType().attack(rScout.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Scout attacking player
		result = rScout.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//General attacking enemy Sergeant
		result = bGnrl.getPieceType().attack(rSarge.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Sergeant attacking player
		result = rSarge.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//General attacking enemy Lieutenant
		result = bGnrl.getPieceType().attack(rLT.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Lieutenant attacking player 
		result = rLT.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//General attacking enemy Captain
		result = bGnrl.getPieceType().attack(rCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Captain attacking player 
		result = rCpt.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//General attacking enemy Major
		result = bGnrl.getPieceType().attack(rMajor.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Major attacking player 
		result = rMajor.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//General attacking enemy Colonel
		result = bGnrl.getPieceType().attack(rCol.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Colonel attacking player 
		result = rCol.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//General attacking enemy General
		result = bGnrl.getPieceType().attack(rGnrl.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		//General attacking player 
		result = rGnrl.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		
		//General attacking enemy Marshal
		result = bGnrl.getPieceType().attack(rMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		//Marshal attacking player 
		result = rMarsh.getPieceType().attack(bGnrl.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		}
	
	@Test
	public void marshalTest() 
		{
		
		//Marshal attacking enemy Sergeant
		result = bMarsh.getPieceType().attack(rScout.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Scout attacking player
		result = rScout.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Sergeant
		result = bMarsh.getPieceType().attack(rSarge.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Sergeant attacking player
		result = rSarge.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Lieutenant
		result = bMarsh.getPieceType().attack(rLT.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Lieutenant attacking player 
		result = rLT.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Captain
		result = bMarsh.getPieceType().attack(rCpt.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Captain attacking player 
		result = rCpt.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Major
		result = bMarsh.getPieceType().attack(rMajor.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Major attacking player 
		result = rMajor.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Colonel
		result = bMarsh.getPieceType().attack(rCol.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//Colonel attacking player 
		result = rCol.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy General
		result = bMarsh.getPieceType().attack(rGnrl.getPieceType());
		assertTrue(result == BattleOutcome.WIN);
		//General attacking player 
		result = rGnrl.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Marshal
		result = bMarsh.getPieceType().attack(rMarsh.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		//Marshal attacking player 
		result = rMarsh.getPieceType().attack(bMarsh.getPieceType());
		assertTrue(result == BattleOutcome.DRAW);
		}	
}