
import java.io.*;
import java.util.Scanner;

class NQueens{


   private static Queen[] solution;
      static int N;
      private static int column;

   public static void main(String[] args) throws IOException{
      
      // check number of command line arguments is at least 2
      if(args.length < 2){
         System.out.println("Usage: java –jar FileCopy.jar <input file> <output file>");
         System.exit(1);
      }

      // open files
      Scanner in = new Scanner(new File(args[0]));
      PrintWriter out = new PrintWriter(new FileWriter(args[1]));


      while(in.hasNextInt()){

      // pull input out of given file and assign to variables
      N = in.nextInt();
       column = in.nextInt();
      int row = in.nextInt();

      //create array od object queen to hold solution
      solution = new Queen[N];

      //place the first queen in that array
      Queen queen1 = new Queen(column , row);
      placeQueen(queen1);
      
      //call the NQueens function and print the solution
      if (nQueens(N , solution) == false) {
         out.println("No solution");
      }
      else{
      for(int i = 0 ; i< N; i++) {
         if( i  ==  N-1)
            { out.println(solution[i].column + " " + solution[i].row );}
         else
         out.print(solution[i].column + " " + solution[i].row +  " ");
      }
   }
}
      

    

      // close files
      in.close();
      out.close();
   }


 public static boolean nQueens(int col, Queen[] sol) {
        
       
      
      // base case: If all queens are placed then return true 
           if (col == 0 ) 
               return true; 
           
           else
            //considering the current column search for a row that works
            for(int row = N; row > 0; row-- ) {
             
               //create a queen to test with
               Queen q = new Queen(col,row);

               //checks if this queen is attacking anything on the board
               if(isAttacking(q) == false) {
                  //put queen in solution for now if it DOESNT ATTACK
                  placeQueen(q);
                  
                    //this is where the reccursion occurs, checking if that queen leads to a solution 
                   if( nQueens(col-1, sol ) == true ){
                     return true;
                  }
                  
               }
               
               //checks if the queen is being tested at the top row
               if (row==1) {
                  //checks to see if the queen is back to the first spot on the board(bottom right)
                  if ( (q.column == N) && (q.row == 1)) {
                     return false;
                  }
                  removeQueen(q);
                  return false;
                  
                  
               }
                  
            }
           
          
       return false;
       
        

}


   public static boolean isAttacking(Queen q) {
      //check column, row, diagonals for existing queen
      
      for( int i = solution.length -1 ; i >= 0; i--) {
         if( (solution[i]==null) || ( (solution[i].column == q.column) &&  (solution[i].row == q.row)  ) )
            continue;
         else
         if ( (solution[i].column == q.column) || (solution[i].row == q.row)||( (solution[i].row + solution[i].column) == (q.row +q.column) ) ||  (solution[i].row - solution[i].column) == (q.row - q.column) ) {
            return true;
         }
         else
            continue;
         
      }
      return false;
      
   }



public static void placeQueen(Queen q){
      
      solution[q.column-1] = q;
      
      
   }


public static void removeQueen(Queen q){
   
   solution[q.column] = null;
   
   
}


}

class Queen{
    int column;
    int row;
 Queen(int col, int row){
   this.row = row;
   this.column = col;
 }

}

