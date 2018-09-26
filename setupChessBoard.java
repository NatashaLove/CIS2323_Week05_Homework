import java.util.*;
import ChessBoard.*;
import ChessPiece.*;

public class  setupChessBoard {
	
	public static void main (String [] args) {
	
		ChessBoard myBoard = new ChessBoard();
		// ChessPiece queen = new ChessPiece("q");
		// myBoard.setPiece(queen, 'g', 5);
		
		//ArrayList<ChessBoard> pieces = new ArrayList<ChessBoard>(32); //create 32 pieces, 16 for both players
		//ChessBoard<String> pieces = new ArrayList<String>(32);
		
		//global variables
		// ChessBoard[][] board = new ChessBoard[8][8]; //to show game status in text based version
		// ArrayList<ChessBoard> pieces = new ArrayList<ChessBoard>(32); //create 32 pieces, 16 for both players
		
		// Add pieces to array list.
		//boolean add(Object o) : This method appends the specified element to the end of the arr list. 
		//.add - method for arrays - here creates array of objs of class ChessBoard
	
		myBoard.showGameStateWithNotation();
	
		
		// prints all the elements available in list  - BUT USED ONLY for ARRAYS!!!
		
		myBoard.printList(); 
		// (Does't print now - can't find pieces..)  - need array here? or print elsewhere..
		
        // for (ChessPiece piece : pieces) { 
		
			// String print = piece.printInfo();
            // System.out.println(" " + print + " ");  
        // } 
		
		/*
		
		'for (thing : listOfThigs)' - is basically shorthand for =
		`for(int i = 0; i < listOfThings.length; i++){ thing = listOfThings[i]}`
		-ONLY for-loop and in Java
		*/
	
	}
 }
 
 
 
 
 // ChessBoard wPawn = new ChessBoard();	
		
	// wPawn.setPieceType(" pawn");
	// wPawn.setColor("white ");
	// wPawn.setPosition(1,2);
	
	// String prnt = wPawn.printInfo();
	// System.out.println(prnt);
	
	// ChessBoard bPawn = new ChessBoard();	
	
	// bPawn.setPieceType(" pawn");
	// bPawn.setColor("black ");
	// bPawn.setPosition(7,6);
	
	// prnt = bPawn.printInfo();
	// System.out.println(prnt);