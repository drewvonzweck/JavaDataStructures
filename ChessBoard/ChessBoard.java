import java.io.*;
import java.util.Scanner;

 public class ChessBoard {

	public Chesspiece firstPiece; 



public static void main(String[] args)throws IOException {

		// check number of command line arguments is at least 2
      if(args.length < 2){
         System.out.println("Usage: java –jar FileCopy.jar <input file> <output file>");
         System.exit(1);
      }
		
		//open files and output file
		Scanner in = new Scanner(new File(args[0]));
		PrintWriter out = new PrintWriter(new FileWriter(args[1]));
		
		

		
		
		while(in.hasNextLine()){
			//make chessboard for that line
			ChessBoard theBoard = new ChessBoard();

			//make the line into a string
		String line1 = in.nextLine();

		//get rid of all colons and spaces
	    line1 = line1.replaceAll("[:]*","");
	    line1 = line1.replaceAll("\\s","");
	    System.out.println(line1);
	    //grab the first two char in the strting
	    char c =  line1.charAt(0);
	    char d =  line1.charAt(1);
	    //make the char into integers
	    int refX = Character.getNumericValue(c);
	    int refY = Character.getNumericValue(d);
	    //out.println("Starting Reference from: (" + refX + ", " + refY + ")");
		int index = 2;
         

		while(index != line1.length() ) {
		int color;
		int col;
		int row; 
		char a;
		char b;
		
		
		char piece = line1.charAt(index);
		
		switch(piece) {


		case 'q':
			color = 0;
			 //grab the next two two char in the strting
	   	 	a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create queen with these parameters
			Queen q = new Queen(col,row,color);
			theBoard.insertNewPiece(q);
			index = index + 3;
			break;
		
		case 'Q':
			color = 1;
			 //grab the next two two char in the strting
	   	 	 a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create queen with these parameters
			Queen Q = new Queen(col,row,color);
			theBoard.insertNewPiece(Q);
			index = index + 3;
			break;

		case 'n':
			color = 0;
			 //grab the next two two char in the strting
	   	 	a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create knight with these parameters
			Knight n = new Knight(col,row,color);
			theBoard.insertNewPiece(n);
			index = index + 3;
			break;
		
		case 'N':
			color = 1;
			 //grab the next two two char in the strting
	   	 	 a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create knight with these parameters
			Knight N = new Knight(col,row,color);
			theBoard.insertNewPiece(N);
			index = index + 3;
			break;

		case 'k':
			color = 0;
			 //grab the next two two char in the strting
	   	 	a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create king with these parameters
			King k = new King(col,row,color);
			theBoard.insertNewPiece(k);
			index = index + 3;
			break;
		
		case 'K':
			color = 1;
			 //grab the next two two char in the strting
	   	 	 a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create King with these parameters
			King K = new King(col,row,color);
			theBoard.insertNewPiece(K);
			index = index + 3;
			break;

		case 'r':
			color = 0;
			 //grab the next two two char in the strting
	   	 	a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create rook with these parameters
			Rook r = new Rook(col,row,color);
			theBoard.insertNewPiece(r);
			index = index + 3;
			break;
		
		case 'R':
			color = 1;
			 //grab the next two two char in the strting
	   	 	 a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create Rook with these parameters
			Rook R = new Rook(col,row,color);
			theBoard.insertNewPiece(R);
			index = index + 3;
			break;

		case 'b':
			color = 0;
			 //grab the next two two char in the strting
	   	 	a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create bishop with these parameters
			Bishop z = new Bishop(col,row,color);
			theBoard.insertNewPiece(z);
			index = index + 3;
			break;
		
		case 'B':
			color = 1;
			 //grab the next two two char in the strting
	   	 	 a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create bishop with these parameters
			Bishop B = new Bishop(col,row,color);
			theBoard.insertNewPiece(B);
			index = index + 3;
			break;

		case 'p':
			color = 0;
			 //grab the next two two char in the strting
	   	 	a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create bishop with these parameters
			Pawn p = new Pawn(col,row,color);
			theBoard.insertNewPiece(p);
			index = index + 3;
			break;
		
		case 'P':
			color = 1;
			 //grab the next two two char in the strting
	   	 	 a =  line1.charAt(index +1);
	    	 b =  line1.charAt(index + 2);
	    	//make the char into integers
	    	 col = Character.getNumericValue(a);
	    	 row = Character.getNumericValue(b);
	    	//create bishop with these parameters
			Pawn P = new Pawn(col,row,color);
			theBoard.insertNewPiece(P);
			index = index + 3;
			break;
			
		default:
			break;
			
		
		}
		
		
		
}
		
	theBoard.display();		
		
		//check if the board is valid
		if ( theBoard.isValid() == false){
			out.println("Invalid");
		}

		else{
				//find if there is a piece at the reference point
		if( theBoard.find(refX,refY) ){
			Chesspiece p = theBoard.getPiece(refX,refY);
			out.print( p.getType() + " ");
			if( p.isAttacking(theBoard) == true){
				out.println("y");
			}
			else
				out.println("n");
		}
		else
			out.println("-");
		
	}
}


		 in.close();
      out.close();


      
    
		
	}





	
	ChessBoard(){
		firstPiece = null;
	}
	
	public boolean isEmpty() {
		return(firstPiece == null);
	}
	
	public void insertNewPiece(Chesspiece p) {
		 Chesspiece newPiece = p;
		 //Connect the first Piece to the new Piece
		 newPiece.next = firstPiece;
		 firstPiece = newPiece;
	}
	
	public Chesspiece removeFirst() {
		Chesspiece pieceReference = firstPiece;
		
		if ( !isEmpty()) {
			//removes the piece from the list
			firstPiece = firstPiece.next;
		}
		else {
			System.out.println("Empty Chessboard");
		}
		
		return pieceReference;
	}
	
	public void display() {
		 Chesspiece thePiece = firstPiece;
	// Start at the reference stored in firstLink and
	// keep getting the references stored in next for
	// every Link until next returns null
		 while(thePiece != null) {
			 thePiece.display();
			 if(thePiece.next == null) {
			 System.out.println("Next Piece: " + thePiece.next);
			 }
			 thePiece = thePiece.next;
			 System.out.println();
			 
		 }
		
		
	}
	
	public boolean find(int col, int row ){
		
		Chesspiece thePiece = firstPiece;
		

		if(!isEmpty()){

			while((thePiece.column != col) || (thePiece.row != row)){
				if(thePiece.next==null)
					return false;
				else
					thePiece = thePiece.next;
			}

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		   
			return true;



	}

	public Chesspiece getPiece(int col, int row ){
		
		Chesspiece thePiece = firstPiece;
		

		if(!isEmpty()){

			while((thePiece.column != col) || (thePiece.row != row)){
				if(thePiece.next==null)
					return null;
				else
					thePiece = thePiece.next;
			}

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
			
			return thePiece;



	}

	public Chesspiece getFirst(){
		return firstPiece;
	}





	public boolean isValid(){
		
		Chesspiece thePiece = firstPiece;
		Chesspiece nextPiece = thePiece.next;
	
		if(thePiece.next==null){
			return true;
		}

		if(!isEmpty()){

			while((thePiece.column != nextPiece.column) || (thePiece.row != nextPiece.row)){
				if(nextPiece.next==null){
					thePiece = thePiece.next;
					nextPiece = thePiece.next;
					if(thePiece.next == null)
						return true;
				}
				else
					nextPiece = nextPiece.next;
			}

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
			return false;



	}
	
	
}
	
	

 class Chesspiece{
	
	int column;
	int row;
	int color;
	
	public Chesspiece next;
	
	Chesspiece(int column, int row, int color){
		this.column = column;
		this.row = row;
		this.color = color;
	}
	public void display() {
		System.out.println("Coordinates: (" + column + ", " + row + ")");
		System.out.println("color: " + color);
		
	}
	
	public  boolean isAttacking(ChessBoard b) {
		
		Chesspiece thePiece = b.getFirst();
		return true;



		
	}

	public char getType(){
		
		return 'P';

	}
	
	}

class Queen extends Chesspiece{
	
Queen(int column, int row, int color) {
		super(column, row, color);
		
		
	}

public  boolean isAttacking(ChessBoard b ) {

	 Chesspiece thePiece = b.getFirst();

	if(! b.isEmpty()){

		

			while(thePiece != null){

		

				if(color == thePiece.color){
					thePiece= thePiece.next;
				}
			else{
				if(column == thePiece.column || row == thePiece.row || (row + column) == (thePiece.row + thePiece.column) || (row - column) == (thePiece.row - thePiece.column)){
					return true;
				}
					thePiece= thePiece.next;
				}
				
			}
			return false;

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
      return false;
		
		
	}

		
	
	
public char getType(){
  
  if (color == 0){
  	return 'q';
  }
  else{
  	return 'Q';
  }

	}
	
}

class Knight extends Chesspiece{ 
	
	Knight(int column, int row, int color){
		super(column, row, color);
	}

public boolean isAttacking(ChessBoard b){
 
 Chesspiece thePiece = b.getFirst();

	if(! b.isEmpty()){

		

			while(thePiece != null){

		

				if(color == thePiece.color){
					thePiece= thePiece.next;
				}
			else{
				if( ((column+1 == thePiece.column) && (row-2 == thePiece.row)) || ((column -1 == thePiece.column) && (row-2 == thePiece.row) ) ||  ((column -2 == thePiece.column) && (row-1 == thePiece.row))
				|| ((column -2 == thePiece.column) && (row+1 == thePiece.row) ) || ((column -1 == thePiece.column) && (row+2 == thePiece.row) ) || ((column +1 == thePiece.column) && (row+2 == thePiece.row) )
				|| ((column +2 == thePiece.column) && (row+1 == thePiece.row) ) || ((column +2 == thePiece.column) && (row-1 == thePiece.row) )  ){
					return true;
				}
					thePiece= thePiece.next;
				}
				
			}
			return false;

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
      return false;
		
		
	}



public char getType(){
  
  if (color == 0){
  	return 'n';
  }
  else{
  	return 'N';
  }

	}

}

class King extends Chesspiece{ 
	
	King(int column, int row, int color){
		super(column, row, color);
	}

public boolean isAttacking(ChessBoard b){
 
 Chesspiece thePiece = b.getFirst();

	if(! b.isEmpty()){

		

			while(thePiece != null){

		

				if(color == thePiece.color){
					thePiece= thePiece.next;
				}
			else{
				if( ((column+1 == thePiece.column) && (row == thePiece.row)) || ((column+1 == thePiece.column) && (row -1 == thePiece.row))  || ((column+1 == thePiece.column) && (row +1 == thePiece.row))
						|| ((column == thePiece.column) && (row +1 == thePiece.row)) || ((column == thePiece.column) && (row -1 == thePiece.row)) || ((column-1 == thePiece.column) && (row == thePiece.row))
						|| ((column-1 == thePiece.column) && (row+1 == thePiece.row)) || ((column-1 == thePiece.column) && (row -1 == thePiece.row))
					){
					return true;
				}
					thePiece= thePiece.next;
				}
				
			}
			return false;

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
      return false;
		
		
	}



public char getType(){
  
  if (color == 0){
  	return 'k';
  }
  else{
  	return 'K';
  }

	}

}

class Rook extends Chesspiece{ 
	
	Rook(int column, int row, int color){
		super(column, row, color);
	}

public boolean isAttacking(ChessBoard b){
 
 Chesspiece thePiece = b.getFirst();

	if(! b.isEmpty()){

		

			while(thePiece != null){

		

				if(color == thePiece.color){
					thePiece= thePiece.next;
				}
			else{
				if( column == thePiece.column || row == thePiece.row){
					return true;
				}
					thePiece= thePiece.next;
				}
				
			}
			return false;

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
      return false;
		
		
	}



public char getType(){
  
  if (color == 0){
  	return 'r';
  }
  else{
  	return 'R';
  }

	}

}

class Bishop extends Chesspiece{ 
	
	Bishop(int column, int row, int color){
		super(column, row, color);
	}

public boolean isAttacking(ChessBoard b){
 
 Chesspiece thePiece = b.getFirst();

	if(! b.isEmpty()){

		

			while(thePiece != null){

		

				if(color == thePiece.color){
					thePiece= thePiece.next;
				}
			else{
				if( (row + column) == (thePiece.row + thePiece.column) || (row - column) == (thePiece.row - thePiece.column) ){
					return true;
				}
					thePiece= thePiece.next;
				}
				
			}
			return false;

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
      return false;
		
		
	}



public char getType(){
  
  if (color == 0){
  	return 'b';
  }
  else{
  	return 'B';
  }

	}

}

class Pawn extends Chesspiece{ 
	
	Pawn(int column, int row, int color){
		super(column, row, color);
	}

public boolean isAttacking(ChessBoard b){
 
 Chesspiece thePiece = b.getFirst();

	if(! b.isEmpty()){

		

			while(thePiece != null){

		

				if(color == thePiece.color){
					thePiece= thePiece.next;
				}
			else{
				if( color == 0){
				if( (column-1 == thePiece.column) && (row+1 == thePiece.row) || (column+1 == thePiece.column) && (row+1 == thePiece.row) ){
					return true;
				}
			}
			else{
					if( (column-1 == thePiece.column) && (row-1 == thePiece.row) || (column+1 == thePiece.column) && (row-1 == thePiece.row) ){
					return true;
				}

			}
					thePiece= thePiece.next;
				}
				
			}
			return false;

		}
 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		   
		  
      return false;
		
		
	}



public char getType(){
  
  if (color == 0){
  	return 'p';
  }
  else{
  	return 'P';
  }

	}

}



