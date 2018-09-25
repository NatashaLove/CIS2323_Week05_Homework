package ChessBoard;
import java.util.*;

public class ChessBoard {
	
	// color - (white 0, black 1)
	String color;
	// type of chess piece
	String name; 
	// row and column for position on the board
	private int column; 
	private int row;
	
	//global variables
	ChessBoard[][] board = new ChessBoard[8][8]; //to show game status in text based version
	ArrayList<ChessBoard> pieces = new ArrayList<ChessBoard>(32); //create 32 pieces, 16 for both players
		
	
	// Default constructor.
	// public ChessBoard() {
	// }
	// Constructor.
	public ChessBoard() {
		initBoard(); //places pieces on the board 
	}
	
	//Constructor. Defines piece color, type and position.
	
	public ChessBoard(String color, String name, int row, int column) {
		this.color = color;
		this.name = name;
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
		
	}

	// Switching row digits onto acronyms
	
	public String getRowAcronym() {
		String acro = "";
		
		switch (getRow()) {
		case 0:
			acro = "a";
			break;
		case 1:
			acro = "b";
			break;
		case 2:
			acro = "c";
			break;
		case 3:
			acro = "d";
			break;
		case 4:
			acro = "e";
			break;
		case 5:
			acro = "f";
			break;	
		case 6:
			acro = "g";
			break;
		case 7:	
			acro = "h";
			break;			
		default:
			break;	
		}
		return acro;
	}
	
	
	public int getCol() {
		return column;
	}

	public void setCol(int column) {
		this.column = column;
	}
	
	//Switching from array enumeration from 0 to chess board enumeration from 1:
	
	public int getColumn() {
		int c = 0;
		
		switch (getCol()) {
		case 0:
			c = 1;
			break;
		case 1:
			c = 2;
			break;
		case 2:
			c = 3;
			break;
		case 3:
			c = 4;
			break;
		case 4:
			c = 5;
			break;
		case 5:
			c = 6;
			break;	
		case 6:
			c = 7;
			break;
		case 7:	
			c = 8;
			break;			
		default:
			break;	
		}
		return c;
	}
	
		
	public String getColor(){
	   return color;
    }
	
	public void setColor(String color){
		this.color=color;
	}
	
    public String getPieceType(){
		return name;
	}
	
    public void setPieceType(String name){
	   this.name=name;
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
					System.out.print(board[i][j].getRowAcronym()); //print acronym
					System.out.print("|"); //print divider
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
	
	
	
	//to print 2 returned values of array (not memory location) use additional: var []= getPosition();
	//and type every element of array in text + position [0]+...;
	
	public String printInfo(){
		//String position[]= getPosition();

		return getColor() + getPieceType() + getRowAcronym() + getColumn()+ "\n"; 
	
		//" \nChess position is x/column:" + position[0] + " and y/row: " + position[1]+ "\n"; // = getPosition() - but this returns MEMORY LOCATION!!!
		// 	INSTEAD OF:  return "Your chess piece is " + getColor() + getPieceType() + 
		//!!! GETPOSITION(); !!!

	}
	
	
	
	//in order to return multiple values - use array:
   
	public String[] getPosition(){
		
		//locating memory for 2 new vars - position 2D
		String position[] = new String [2];
		
		//convert int to string
		String columnAsString = Integer.toString(column);
		String rowAsString = Integer.toString(row);
		position[0]=columnAsString;
		position[1]=rowAsString;
	
	// returns MEMORY LOCATIONS of array elements! ([Ljava.lang.String;@15db9742)
		return position;
	}
	
    public void setPosition(int column, int row){	
		this.column=column;
		this.row=row;
	}
	
	
	// public class ChessBoard {

	
	// }
	
	/**
	 * Create piece objects and populate the board with them.
	 * For text based version.
	 */
	public void initBoard() {
	//	emptyBoard(); //removes the board from pieces
		createPieces(); //creates piece objects
	//	populateBoard(); //populates the board with piece objects
	}
	
	void createPieces() {
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
	
	
	// Get all pieces as an arraylist.
	public ArrayList<ChessBoard> getPieces() {
		return pieces;
	}
	
	// Set arraylist wich contains all pieces.
	 
	public void setPieces(ArrayList<ChessBoard> pieces) {
		this.pieces = pieces;
	}

	
	
	
}