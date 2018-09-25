import java.util.*;
import ChessBoard.*;

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
	
		/*void createPieces() {
			//add eight pawns for both colors
			for (int i=0; i<8; i++) { 
				// constructor: ChessBoard(String color, String name, int row, int column)
				pieces.add(new ChessBoard("B", "P", i, 1)); //black pawns to 2nd row 
				pieces.add(new ChessBoard("W", "P", i, 6)); //white pawns to 7 row
			}
			// Create new objects (chess pieces) with help of constructor
			//populate rooks
			pieces.add(new ChessBoard("B", "R", 0, 0)); //black rook a1
			pieces.add(new ChessBoard("B", "R", 7, 0)); //black rook h1
			pieces.add(new ChessBoard("W", "R", 0, 7)); //white rook a8
			pieces.add(new ChessBoard("W", "R", 7, 7)); //white rook h8
			//populate knights
			pieces.add(new ChessBoard("B", "N", 1, 0)); //black knight b1
			pieces.add(new ChessBoard("B", "N", 6, 0)); //black knight g1
			pieces.add(new ChessBoard("W", "N", 1, 7)); //white knight b8
			pieces.add(new ChessBoard("W", "N", 6, 7)); //white knight g8
			//populate bishops
			pieces.add(new ChessBoard("B", "B", 2, 0)); //black bishop c1
			pieces.add(new ChessBoard("B", "B", 5, 0)); //black bishop f1
			pieces.add(new ChessBoard("W", "B", 2, 7)); //white bishop c8
			pieces.add(new ChessBoard("W", "B", 5, 7)); //white bishop f8
			//populate queens
			pieces.add(new ChessBoard("B", "Q", 3, 0)); //black queen d1
			pieces.add(new ChessBoard("W", "Q", 3, 7)); //white queen d8
			//populate kings
			pieces.add(new ChessBoard("B", "K", 4, 0)); //black king e1
			pieces.add(new ChessBoard("W", "K", 4, 7)); //white king e8
		}
	*/
		// prints all the elements available in list 
		
		//System.out.println(pieces);// but this prints memory location
		
		// System.out.println(prnt);
		
		
		// This loop prints elements from array list (with printInfo() method from he ChessBoard class
		
		/* such FOR loop (with condition like 
		
        for (Integer number : arrlist) { 
            System.out.println("Number = " + number); 
        } 
		// prints all the elements available in list  - BUT USED ONLY for ARRAYS!!!
		*/
		
        // for (ChessBoard piece : pieces) { 
		
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