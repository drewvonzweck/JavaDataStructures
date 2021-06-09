import java.io.*; 
import java.util.*;
import java.util.Scanner;
public class NQueens {

	public static void main(String[] args) throws IOException{
      
      // check number of command line arguments is at least 2
      if(args.length < 2){
         System.out.println("Usage: java –jar FileCopy.jar <input file> <output file>");
         System.exit(1);
     }

      // open files
      Scanner in = new Scanner(new File(args[0]));
      PrintWriter out = new PrintWriter(new FileWriter(args[1]));

   while(in.hasNextLine()){

		
		Stack<Queen> stack = new Stack<>(); 
		int placed = 0;
		int N;
		Boolean noSolution = false;
		int colAt;
		
		//grab the first integer of the line and assign it to N	
		N = in.nextInt();
		colAt = N;
		System.out.println(N);

		//make the line into a string and get rid of blank spaces
		String line = in.nextLine();
		System.out.println(line);

		//splitting the line at the spaces
		String[] splitStr = line.trim().split("\\s+");
	
		
		//fill a stack with N null values
		for(int i = 0; i < N ; i++) {
			stack.push(null);
		}

		for(int i =0; i < splitStr.length; i = i +2 ){
			
		//go through the array column and grab string then convert to int
			String c = splitStr[i];
			int col = Integer.parseInt(c);

		//grab row and convert to int
			String r = splitStr[i+1];
			int row = Integer.parseInt(r);


		//make a queen from these converted strings
			Queen q1 = new Queen(col,row,true);
		stack.removeElementAt(q1.column-1);
		stack.insertElementAt(q1, q1.column -1);
		placed ++;

		//check if adding this permanent queen is attacking someone
		if(isAttacking(q1,stack) == true){
			noSolution = true;
		}

		}
	
		 
		
		toString(stack);
		
		
		
		
		while( !(placed >N) && noSolution==false){
		
		//if we've placed N Queens then were done
			if(placed == N) {
				break;
			}
			else {
		
		//start in the first column that isnt occupied... starting at column N and moving left
		//find the first unoccupied column
		while(stack.get(colAt-1) != null) {
				colAt--;
			}
		
		System.out.println("Starting at column:" + colAt);
	
		}
			//create test queen to check for attack
			Queen test;	
		for(int row = 1; row <= N; row++) {
			
			System.out.println("Trying row:"+ (row));
			//set test queen at the first empty column first row
			 test = new Queen(colAt,row,false);
			 //check attack
			 if(isAttacking(test,stack) == false) {
				 System.out.println("Test queen isnt attacking anyone ");
				 //add the queen to the stack
				 	stack.removeElementAt(test.column-1);
					stack.insertElementAt(test, test.column -1);
					System.out.println("Placing " + test.display());
					placed ++;
					System.out.println("Placed");
					colAt--;
					
					break;
			 }
			
			 //if the queen is attacking 
			 //move up rows and keep trying
			 
			//check and see if we've tried every row
		while(row ==N) {
			
			
			System.out.println("Couldnt place Queen in this column");
			
			//check and see if were in the Nth column and cant go back
			if(colAt == N && row == N) {
				noSolution = true;
				break;
			}
			
			//go back a column and check if its the Nth column
				colAt++;
				if(colAt == N && stack.get(colAt-1).row == N) {
					noSolution = true;
				   break;
				}
			
			//go right through the columns looking for the first non-permanent queen
			while(stack.get(colAt-1).permanent!= false) {
				colAt++;
				
			
			}
			System.out.println("need to adjust queen at column:" + colAt);
			
			System.out.println("Moved back to column "+ colAt + " at row " + stack.get(colAt-1).row);
			 row = stack.get(colAt-1).row;
			 	
			
			 //remove the first non-permanent queen
			stack.removeElementAt(colAt-1);
			stack.insertElementAt(null, (colAt-1));
			placed--;
			
		}
			 
		}
		
		
		
		toString(stack);
		System.out.println();
		
		
			}	
	
	
		if(noSolution) {
			System.out.println("NO SOLUTION");
			out.println("No solution");
		}
		else {
		toString(stack);

		//print to out solution

		for (int i = 0; i < stack.size(); i ++) {
				if(i == stack.size()-1){
					out.println(stack.elementAt(i).column +" " + stack.elementAt(i).row);
				}

			else
				out.print(stack.elementAt(i).column +" " + stack.elementAt(i).row + " ");
			}
		}

		
		
		
		
		}   //end bracket for hasNextLine()
		in.close();
      out.close();
		
	}
	
	
	public static void toString( Stack<Queen> stack) {
		for (int index = 0; index < stack.size(); index ++) {
			if(stack.elementAt(index) == null) {
				System.out.println("NULL");
			}
			else {
			System.out.println("( " + stack.elementAt(index).column +", " + stack.elementAt(index).row + ")" );
			}
		}
	}

	
	
	
	
	public static boolean isAttacking(Queen q, Stack<Queen> s) {
	      //check column, row, diagonals for existing queen
	      
	      for( int i = s.size() -1 ; i >= 0; i--) {
	         if( (s.get(i)==null) || ( (s.get(i).column == q.column) &&  (s.get(i).row == q.row)  ) )
	            continue;
	         else
	         if ( (s.get(i).column == q.column) || (s.get(i).row == q.row)||( (s.get(i).row + s.get(i).column) == (q.row +q.column) ) ||  (s.get(i).row - s.get(i).column) == (q.row - q.column) ) {
	            return true;
	         }
	         
	         
	      }
	      return false;
	      
	   }	
	

}

class Queen{
    int column;
    int row;
    boolean permanent;
 Queen(int col, int row, boolean permanent){
   this.row = row;
   this.column = col;
   this.permanent=permanent;
 }
 
 public String display() {
	 String s = "Queen at: (" + column + ", " + row + ")";
	 return s;
	 
 }

}
