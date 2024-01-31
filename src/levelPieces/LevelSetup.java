package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	
	Drawable[] board;
	
	public LevelSetup() {
		
	}

	public void createLevel(int nLevel) {
		board = new Drawable[nLevel];
	}

	public Drawable[] getBoard() {
		return board;
	}

	public ArrayList<Moveable> getMovingPieces() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPlayerStartLoc() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


