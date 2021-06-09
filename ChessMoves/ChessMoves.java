import java.io.*;
import java.util.Scanner;

public class ChessMoves {

	
	
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

		 ChessBoard theBoard = new ChessBoard();

		//make the line into a string
		//String line1 = in.nextLine();

		String line1 = in.nextLine();
		

		line1 = line1.replaceAll("\\s","");
		System.out.println(line1);
		
		int index = 0;
		while( line1.charAt(index)!= ':' ) {
			
		
		int color;
		int col;
		int row; 
		char a;
		char b;
		
		//grab the character that decides what chesspiece to make
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
 		boolean isLegal = true;
 		int colorTurn = 0;
 		int color;
 		

		
		//after the colon we can assume that the rest of the string are integers
		//we iterate through these integers in groups of 4 the starting coordinates and the ending coordinates
		while((index != line1.length()-1) && (isLegal == true)) {
			index++;
			char a,b,c,d;
			int colStart,rowStart,colEnd,rowEnd;
			color = colorTurn%2;
			System.out.println("TEAM " + color + "'s TURN");
			
			//grab the next two chars that represent that start of the move to take place
			 a =  line1.charAt(index);
			 index++;
	    	 b =  line1.charAt(index );
	    	 index++;
	    	//make the char into integers
	    	 colStart = Character.getNumericValue(a);
	    	 rowStart = Character.getNumericValue(b);
	    	 
	    	 //grab the next two chars that represent the ending point of the move
	    	 c =  line1.charAt(index);
	    	 index++;
	    	 d =  line1.charAt(index);
	    	 
	    	//make the char into integers
	    	 colEnd = Character.getNumericValue(c);
	    	 rowEnd = Character.getNumericValue(d);
	    	 
	    	//this is where we begin to make the move at hand
	    	 
	    	 System.out.print("Starting point(" + colStart + ", " + rowStart + ")");
	    	 System.out.println("Ending point(" + colEnd + ", " + rowEnd + ")");
	    	 System.out.println();
	    	 
	    	 
	    //diplay the linked list of chesspieces so far	 
	    ChessBoard.display();

	    Chesspiece ref;
		
	      //checks to see if the current chesspieces are valid
	     		if(ChessBoard.isValid())	{
	    			System.out.println("Current ChessBoard is valid");
	    		
	    
	     		//checks to see if there is a piece at the starting move square
	    	if( ChessBoard.getPiece(colStart,rowStart) == null) {
	    			System.out.println("There is no ChessPiece at the starting point");
	    			out.println(colStart + " " + rowStart + " "+ colEnd + " " + rowEnd  + " illegal");
	    			isLegal = false;
	    			break;
	    			}
	     		
	     //if there is a chesspiece at the starting point then we create a reference to hold the info of that piece
	    else {
	    		
	    		ref = ChessBoard.getPiece(colStart, rowStart);
	    		System.out.print( "ref is: ");
	    		ref.display();

	    			//check if ref is on the team whose turn it is
	    		if(ref.color != (colorTurn % 2) ){
	    			out.println( colStart + " " + rowStart + " "+ colEnd + " " + rowEnd  + " illegal");
	    	    		System.out.println("Chesspiece at("+ colStart + ", " + rowStart + ") is not on the team whose turn it is!" );
	    	    			isLegal = false;
	    		}

	    		//ref is on the team whose turn it is
	    		else{
	    		
	    		//if the end square is empty or contains an enemy chesspiece we enter this if statment
	    		if( (ChessBoard.getPiece(colEnd,rowEnd) == null) || (ChessBoard.getPiece(colEnd,rowEnd).color != ref.color)) {
	    			System.out.println("There is no ChessPiece at the end point or there is and we can capture it");
	    			
	    			//check if the type of chesspiece is capable of moving to that square
	    			if(ref.canMove(theBoard,colEnd,rowEnd)) {
	    	    		System.out.println("Chesspiece at("+ colStart + ", " + rowStart + ") capable of moving to end Square (" + colEnd + ", " + rowEnd + ")");
	    	    		//move it
	    	    		theBoard.move(ref, colEnd, rowEnd);
	    	    		//now see if after the move if the KING is in check
	    	    		if (theBoard.isInCheck(color)){
	    	    			System.out.println("This move is illegal because it caused King to be in check");
	    	    			out.println( colStart + " " + rowStart + " "+ colEnd + " " + rowEnd  + " illegal");
	    	    			isLegal = false;
	    	    		}
	    	    		
	    	    	}
	    	    	//if the type of chesspiece is not capable of moving to that square then this move in illegal
	    	    	else {
	    	    		out.println( colStart + " " + rowStart + " "+ colEnd + " " + rowEnd  + " illegal");
	    	    		System.out.println("Chesspiece at("+ colStart + ", " + rowStart + ") is NOT capable of moving to end Square (" + colEnd + ", " + rowEnd + ")");
	    	    			isLegal = false;
	    	    	}
	    			
	    			}
	    		
	    		else {
	    			//this means that there is a piece occupying the end square that is on the team
	    			out.println( colStart + " " + rowStart + " "+ colEnd + " " + rowEnd  + " illegal");
	    			isLegal= false;
	    		}
	    		
	    	
	    		ChessBoard.display();
	    		
	    	
	    	}//end bracket for the right color 2 turn check
	    	
	    		
	    }// end bracket for else (there is a piece at the starting point
		
	     		} //end bracket for isValid
	     		
	     		else {
	     			out.println( colStart + " " + rowStart + " "+ colEnd + " " + rowEnd  + " illegal");
	     			System.out.println("Chessboard is illegal");
	     			isLegal = false;
	     		}
	     	
	     	//change turn
	     	colorTurn++;		
			
		}//end bracket for indexing moves while loop

	//after we have either done all the moves or failed the while loop
		//check if is legal is true
if(isLegal == true){
	out.println("legal");
}
	


	}//end bracket for Line while loop

	in.close();
      out.close();
	}//end bracket for main	
	
}//end bracket for class


 class ChessBoard {

	public static Chesspiece firstPiece; 


	ChessBoard(){
		firstPiece = null;
	}
	
	public static boolean isEmpty() {
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
	
	public static void display() {
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


	public Chesspiece find(int color, char type ){
		
		Chesspiece thePiece = firstPiece;
		

		if(!isEmpty()){

			while((thePiece.color != color) || (thePiece.getType() != type)){
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

	public boolean isInCheck(int color){
		boolean kingFound = false;
		char king;
		Chesspiece daKing;
		Chesspiece thePiece = firstPiece;
		
		//see if its black turn
		if(color == 1){
			//define the type of king were looking for
			 king = 'K';
			}
		
		//if not black turn then its white turn
		else{
			//define the type of king were looking for
			 king = 'k';
		}
		//set the reference piece to the king that is found on the team at hand
		//if no team is found ref = null;
		daKing = find(color, king);
		if( daKing == null){
			System.out.println("NO KING FOUND TO CHECK");
			return false;
		}
		else{
			
			System.out.println("Checking if: ");
		   daKing.display();
		   System.out.println("is in check");
		   System.out.println();
	
			//now we have the King to check so we must iterate through all the enemy pieces and check for canMove() to the Kings square
		   //iterate through all pieces
		   if(! isEmpty() ){ 
		   		
		   		int pieceCounter = 0;
		   		

		   //iterate through the entire chessboard
		   		int pieceCount = 0;

		   while(thePiece != null){
		   		
		   		System.out.println("Checking piece: " + pieceCount);
		   		pieceCount ++;
		   		
		   		//team check
		   	if(thePiece.color != daKing.color){
		   		
		   		//attack check
		   		if(thePiece.canMove(this, daKing.column, daKing.row)){
		   			
		   			System.out.println("THE KING IS UNDER ATTACK THIS MOVE IS ILLEGAL");
						return true;
					}
				else{

					thePiece = thePiece.next;
				}
		   	}
		   	
		   	else{
		   		thePiece = thePiece.next;
		   	}
		 }

		 System.out.println("NO PIECES ATTACKED THE KING");
		 return false;


	}
		else{
       
       System.out.println("Empty LinkedList");
       return false;

		}
	
}

}

	public static Chesspiece getPiece(int col, int row ){
		
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


	public void removePiece(Chesspiece p){
        Chesspiece currentPiece = firstPiece;
		Chesspiece previousPiece = firstPiece;
		
		// Keep searching as long as a match isn't made
		
		while((currentPiece.column != p.column) || (currentPiece.row != p.row)){
			
			// Check if at the last Piec in the Board
			
			if(currentPiece.next == null){
				
				// Match not found so leave the method
				
				return; 
				
			} else {
				
				// We checked here so let's look in the
				// next Link on the list
				
				previousPiece = currentPiece; 
				
				currentPiece = currentPiece.next;
				
			}
			
		}
		
		if(currentPiece == firstPiece){
			
		
			
			firstPiece = firstPiece.next;
			
		} else {
			
			
			
		
			
			previousPiece.next = currentPiece.next;
			
		}
		
		
		
	}
	
	

	public void move(Chesspiece p, int col2b, int row2b){

	Chesspiece thePiece = firstPiece;
	Chesspiece reference;	
	boolean occupied = false;

	System.out.print("Moving: " ) ;
	p.display();
	System.out.println("to:("+ col2b + ", " + row2b + ")");

		if(!isEmpty()){
				
				//searching for piece occupying the end square
			while((thePiece.column != col2b) || (thePiece.row != row2b)){
				
				//if not found break out of search loop
				if(thePiece.next==null){
					break;
				}
				else{
					//move to the next piece
						thePiece = thePiece.next; }
					
					}

										
					//check to see if thePiece is actually the piece occupying the endpoint
					//this check is necesarry because it might just be the last Piece
					if(thePiece.column == col2b && thePiece.row == row2b){
						occupied = true;
					}
						//if the square to be is occupied then check if its an enemy then delete it
						if(occupied){
					//if found make sure its an enemy and if it is remove it
					if(thePiece.color != p.color)	{
						removePiece(thePiece);

				}
			}
				thePiece = firstPiece;

				//now that the player occupying the endpiece is gone we need to find p and move it
			while((thePiece.column != p.column)|| (thePiece.row != p.row)){
						//if not found break out of search loop
				if(thePiece.next==null)
					return;

				else{
					//move to the next piece
						thePiece = thePiece.next; 
					}
					}


			}

 			
else {
			
			System.out.println("Empty LinkedList");
			
		}
		 p.column = col2b;
		 p.row = row2b;
			
}





	
	public static boolean isValid(){
		
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
System.out.println(nextPiece.column + " " + nextPiece.row + " " + thePiece.column + " " +thePiece.row);
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
		System.out.print( getType() );
		System.out.println(" at coordinates: (" + column + ", " + row + ")");
		if(color==0)
		System.out.println("color: white");
		if(color==1)
			System.out.println("color: black");
		
		
	}
	
	
	
	public boolean canMove(ChessBoard b,int col2b, int row2b) {


return false;


}

	public char getType(){
		
		return 'P';

	}
	
	}

class Queen extends Chesspiece{
	
Queen(int column, int row, int color) {
		super(column, row, color);
		
		
	}


		
public boolean canMove(ChessBoard b,int col2b, int row2b) {

//HORIZONTALS AND VERTICALS
	//checks for vertical movement
			if(column == col2b)	{
				
				//checks for upward movement
				if(row2b < row){
					
         				int check;

					boolean isBlocked=false;
					for( check = row-1 ; check > row2b; check--) {
						isBlocked = b.find(column,check);
						if(isBlocked){
							return false;
						}

					}
					return true;



                  }
        		 //checks for downward movement
         			if(row2b>row){

         				int check;
         				
					boolean isBlocked=false;
					for( check = row+1 ; check < row2b; check++) {
						isBlocked = b.find(column,check);
						if(isBlocked){
							return false;
						}

					}
					return true;


         }
    }	
    
    //horizontal movement
    	if(row == row2b){

    		//checks for left movement
				if(col2b < column){
					
         				int check;

					boolean isBlocked=false;
					for( check = column-1 ; check > col2b; check--) {
						isBlocked = b.find(check,row);
						if(isBlocked){
							return false;
						}

					}
					return true;



                  }
        		 //checks for right movement
         			if(col2b>column){

         				int check;
         				
					boolean isBlocked=false;
					for( check = column+1 ; check < col2b; check++) {
						isBlocked = b.find(check,row);
						if(isBlocked){
							return false;
						}

					}
					return true;
			}

			
   }


//DIAGONALS
	//check for the upwards diagonal
	   if( (column + row) == (col2b + row2b) ){
 
 		  //moving up
	   	  if(row2b <row){
	   			int checkCol;
	   			int checkRow = row-1;
	   			boolean isBlocked = false;

	   			for(checkCol = column + 1; checkCol < col2b; checkCol ++ ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow--;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;

	   		}
		
		//moving down
		if(row2b > row)	{

				int checkCol;
	   			int checkRow = row + 1;
	   			boolean isBlocked = false;

	   			for(checkCol = column - 1; checkCol > col2b; checkCol -- ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow++;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;
		}


    }
     //downwards diagonal
		if((column - row) == (col2b - row2b)){

		//moving up
	   	if(row2b <row){
	   			int checkCol;
	   			int checkRow = row-1;
	   			boolean isBlocked = false;

	   			for(checkCol = column - 1; checkCol > col2b; checkCol-- ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow--;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;

	   		}
		
		//moving down
		if(row2b > row)	{

				int checkCol;
	   			int checkRow = row + 1;
	   			boolean isBlocked = false;

	   			for(checkCol = column + 1; checkCol < col2b; checkCol++ ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow++;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;
		}




			
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



public boolean canMove(ChessBoard b,int col2b, int row2b) {


	if(         ((column+1 == col2b) && (row-2 == row2b)) || ((column -1 == col2b) && (row-2 == row2b) ) ||  ((column -2 == col2b) && (row+1 == row2b))
				|| ((column -2 == col2b) && (row-1 == row2b) ) || ((column -1 == col2b) && (row+2 == row2b) ) || ((column +1 == col2b) && (row+2 == row2b) )
				|| ((column +2 == col2b) && (row+1 == row2b) ) || ((column +2 == col2b) && (row-1 == row2b) )  ){
					return true;
				}
else {			
			return false;
  }
		
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
//Kings only move one square at a time therefore I dont have to check for blocking pieces, just if there is a teammate at the endpoint	
	King(int column, int row, int color){
		super(column, row, color);
	}



public boolean canMove(ChessBoard b,int col2b, int row2b) {
	

if( ((column+1 == col2b) && (row == row2b)) || ((column+1 ==  row2b) && (row -1 ==  col2b))  || ((column+1 ==  col2b) && (row +1 == row2b))
|| ((column ==  col2b) && (row +1 == row2b)) || ((column ==  row2b) && (row -1 ==  col2b)) || ((column-1 ==  col2b) && (row == row2b))
|| ((column-1 ==  col2b) && (row+1 == row2b)) || ((column-1 ==  row2b) && (row -1 ==  col2b))
){
	return true;
}
else {			
			return false;
  }
	
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



public boolean canMove(ChessBoard b,int col2b, int row2b) {
	
	

		//checks for vertical movement
			if(column == col2b)	{
				
				//checks for upward movement
				if(row2b < row){
					
         				int check;

					boolean isBlocked=false;
					for( check = row-1 ; check > row2b; check--) {
						isBlocked = b.find(column,check);
						if(isBlocked){
							return false;
						}

					}
					return true;



                  }
        		 //checks for downward movement
         			if(row2b>row){

         				int check;
         				
					boolean isBlocked=false;
					for( check = row+1 ; check < row2b; check++) {
						isBlocked = b.find(column,check);
						if(isBlocked){
							return false;
						}

					}
					return true;


         }
    }	
    
    //horizontal movement
    	if(row == row2b){

    		//checks for left movement
				if(col2b < column){
					
         				int check;

					boolean isBlocked=false;
					for( check = column-1 ; check > col2b; check--) {
						isBlocked = b.find(check,row);
						if(isBlocked){
							return false;
						}

					}
					return true;



                  }
        		 //checks for right movement
         			if(col2b>column){

         				int check;
         				
					boolean isBlocked=false;
					for( check = column+1 ; check < col2b; check++) {
						isBlocked = b.find(check,row);
						if(isBlocked){
							return false;
						}

					}
					return true;
			}

			
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



public boolean canMove(ChessBoard b, int col2b, int row2b) {
		
		//check for the upwards diagonal
	   if( (column + row) == (col2b + row2b) ){
 
 		  //moving up
	   	  if(row2b <row){
	   			int checkCol;
	   			int checkRow = row-1;
	   			boolean isBlocked = false;

	   			for(checkCol = column + 1; checkCol < col2b; checkCol ++ ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow--;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;

	   		}
		
		//moving down
		if(row2b > row)	{

				int checkCol;
	   			int checkRow = row + 1;
	   			boolean isBlocked = false;

	   			for(checkCol = column - 1; checkCol > col2b; checkCol -- ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow++;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;
		}


    }
     //downwards diagonal
		if((column - row) == (col2b - row2b)){

		//moving up
	   	if(row2b <row){
	   			int checkCol;
	   			int checkRow = row-1;
	   			boolean isBlocked = false;

	   			for(checkCol = column - 1; checkCol > col2b; checkCol-- ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow--;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;

	   		}
		
		//moving down
		if(row2b > row)	{

				int checkCol;
	   			int checkRow = row + 1;
	   			boolean isBlocked = false;

	   			for(checkCol = column + 1; checkCol < col2b; checkCol++ ){
	   				isBlocked = b.find(checkCol,checkRow);
	   				checkRow++;
	   			
	   			if(isBlocked){
	   				return false;
	   			}
	   		}
	   		return true;
		}




			
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



public boolean canMove(ChessBoard b,int col2b, int row2b) {
   
   //check if pawn is white(row increases)
	boolean occupied = false;
	boolean blocked = false;
	if(color == 0){
		//check if its moving straight line up one
		if( (row2b == row +1) && (col2b == column)){

			//check if that piece is occupied cuz pawns cant capture moving straight
			occupied = b.find(col2b,row2b);
			if(occupied){
				return false;
			}
			else
				return true;
		}
		else{
			
			//check if its trying to move 2 squares up( only possible on row 2)
			if( (row2b == row +2) && (col2b == column)){
				
				if(row == 2){
				//check if that piece is occupied cuz pawns cant capture moving straight
				occupied = b.find(col2b,row2b);
				if(occupied)
					return false;
				else
					//if not occupied see if there is a player blocking the jumop
					blocked = b.find(col2b,(row2b-1));
					if (blocked)
						return false;
					else
						return true;

			}
			else
				return false;
		}
			
		}
		

	//now check if its trying to move to the upwards diagonal(this is only possible if an enemy occupies that square)
		if( ( (column -1 == col2b) && ((row+1) == row2b) ) || ( (column + 1 == col2b) && ((row+1) == row2b) )){
				 occupied = b.find(col2b,row2b);
				 
				 if(occupied) 
				 	return true;
				 else
				 	return false;



		}
	}
  
  //check if pawn is black(row decreases)
	if(color == 1){
		//check if its moving straight line down one
		if( (row2b == row -1) && (col2b == column)){

			//check if that piece is occupied cuz pawns cant capture moving straight
			occupied = b.find(col2b,row2b);
			if(occupied){
				return false;
			}
			else
				return true;
		}
		else{
			
			//check if its trying to move 2 squares down( only possible on row 2)
			if( (row2b == row -2) && (col2b == column)){
				
				if(row == 7){
				//check if that piece is occupied cuz pawns cant capture moving straight
				occupied = b.find(col2b,row2b);
				if(occupied)
					return false;
				else
					//if not occupied see if there is a player blocking the jumop
					blocked = b.find(col2b,(row2b+1));
					if (blocked)
						return false;
					else
						return true;

			}
			else
				return false;
		}
			
		}
	//now check if its trying to move to the downwards diagonal(this is only possible if an enemy occupies that square)
	if( ( (column -1 == col2b) && ((row-1) == row2b) ) || ( (column + 1 == col2b) && ((row-1) == row2b) )){

           occupied = b.find(col2b,row2b);
				 
				 if(occupied) 
				 	return true;
				 else
				 	return false;


			
		}



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
	
	

 


