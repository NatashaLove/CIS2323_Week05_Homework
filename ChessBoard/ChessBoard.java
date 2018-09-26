package ChessBoard;
import java.util.*;
import ChessPiece.*;

public class ChessBoard {
	
	//global variables
	 
	// ChessBoard[][] board = new ChessBoard[8][8]; //to show game status in text based version
	String[][] board = new String[8][8];
	ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>(32); //create 32 pieces, 16 for both players
	
	//*******************
	/*
	GETTERS & SETTERS?
*/
	// public ChessBoard getPiece(x, y){
		// {}
	// }
	
	// public void setPiece (ChessPiece, x, y)  {
		// {}
		
		
		/**
	 * Use arraylist to populate board.
	 * For text based version.
	 */
	// private void populateBoard() {
		// for (Piece p : pieces) { //white pieces left
		    // board[p.getRow()][p.getCol()] = p; //place piece to board
		// }	
	// }
		
//********	
		
	//	myBoard.setPiece(queen, 'g', 5);
	//Setter methods some basic collision detection.
	//???
/*
	public void setPiece(string, char, int) ??
	{
		
	}
	
*/
	//********************
	
	
	// Default constructor.
	// public ChessBoard() {
	// }
	// Constructor.
	public ChessBoard() {
		initBoard(); //places pieces on the board 
	}
	
	/*
	 Shows the current game state which is 8x8 board with pieces on it.
	 Shows notation on each side.
	 */
	public void showGameStateWithNotation() {
		System.out.println();
		System.out.println("     a  b  c  d  e  f  g  h"); //alphabetic notation
		System.out.println("  ###########################");
		for (int i=0; i<=7; i++) { //rows
			System.out.print(8-i+" #|"); //all rows begin with a divider
			for (int j=0; j<=7; j++) { //columns
				if (board[i][j] == null) { //if empty square
					System.out.print("  "); //print empty string
					System.out.print("|"); //print divider
				} else {
					// System.out.print(board[i][j].getRowAcronym()); //print acronym
					// System.out.print("|"); //print divider
				}
			}
			System.out.println("# " +(8-i)); //next row
			if (i!=7) {
				System.out.println("  #|-----------------------|#"); //linebreak between rows
			}
		}
		System.out.println("  ###########################");
		System.out.println("     a  b  c  d  e  f  g  h"); //alphabetic notation
		System.out.println();
	}
	
	/*
	Create piece objects and populate the board with them.
	 */
	public void initBoard() {
	//	emptyBoard(); //removes the board from pieces
		createPieces(); //creates piece objects
	//	populateBoard(); //populates the board with piece objects
	}
	
	void createPieces() {
		//add eight pawns for both colors
		for (int i=0; i<8; i++) { 
		
			// constructor: public ChessPiece(String color, String name, int row, int column)
			pieces.add(new ChessPiece("B", "P", i, 1)); //black pawns to 2nd row 
			pieces.add(new ChessPiece("W", "P", i, 6)); //white pawns to 7 row
		}
		// Create new objects (chess pieces) with help of constructor
		//populate rooks
		pieces.add(new ChessPiece("B", "R", 0, 0)); //black rook a1
		pieces.add(new ChessPiece("B", "R", 7, 0)); //black rook h1
		pieces.add(new ChessPiece("W", "R", 0, 7)); //white rook a8
		pieces.add(new ChessPiece("W", "R", 7, 7)); //white rook h8
		//populate knights
		pieces.add(new ChessPiece("B", "N", 1, 0)); //black knight b1
		pieces.add(new ChessPiece("B", "N", 6, 0)); //black knight g1
		pieces.add(new ChessPiece("W", "N", 1, 7)); //white knight b8
		pieces.add(new ChessPiece("W", "N", 6, 7)); //white knight g8
		//populate bishops
		pieces.add(new ChessPiece("B", "B", 2, 0)); //black bishop c1
		pieces.add(new ChessPiece("B", "B", 5, 0)); //black bishop f1
		pieces.add(new ChessPiece("W", "B", 2, 7)); //white bishop c8
		pieces.add(new ChessPiece("W", "B", 5, 7)); //white bishop f8
		//populate queens
		pieces.add(new ChessPiece("B", "Q", 3, 0)); //black queen d1
		pieces.add(new ChessPiece("W", "Q", 3, 7)); //white queen d8
		//populate kings
		pieces.add(new ChessPiece("B", "K", 4, 0)); //black king e1
		pieces.add(new ChessPiece("W", "K", 4, 7)); //white king e8
	}
	
	
	// Get all pieces as an arraylist.
	public ArrayList<ChessPiece> getPieces() {
		return pieces;
	}
	
	// Set arraylist wich contains all pieces.
	 
	public void setPieces(ArrayList<ChessPiece> pieces) {
		this.pieces = pieces;
	}

	// prints all the elements available in list  - BUT USED ONLY for ARRAYS!!!
	public void printList() {
	for (ChessPiece piece : pieces) { 
		
			String print = piece.printInfo();
            System.out.println(" " + print + " ");  
        }
	}		
	
	
}