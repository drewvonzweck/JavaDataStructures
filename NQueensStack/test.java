import java.io.*; 
import java.util.*;
import java.util.Scanner;
public class test {

	public static void main(String[] args) throws IOException{
      
      // check number of command line arguments is at least 2
      if(args.length < 2){
         System.out.println("Usage: java –jar FileCopy.jar <input file> <output file>");
         System.exit(1);
     }

      // open files
      Scanner in = new Scanner(new File(args[0]));
      PrintWriter out = new PrintWriter(new FileWriter(args[1]));

   while( in.hasNextLine() ){

		int N;
		N = in.nextInt();
		System.out.println(N);
		int index = 0;
		String line = in.nextLine();
		
		
		
		String[] splitStr = line.trim().split("\\s+");


		

		for(int i =0; i < splitStr.length; i = i +2 ){
			System.out.println("(" + splitStr[i] + ", " + splitStr[i +1] + ")");
		}







		



		
		
		}

}
}