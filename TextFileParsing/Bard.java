import java.io.File;
import java.util.Hashtable;

import java.util.Scanner;
import java.awt.List;
import java.io.*;
import java.util.Enumeration;
import java.util.*;
public class Bard {

	public static void main(String[] args) throws IOException { 


		// check number of command line arguments is at least 2
      if(args.length < 2){
         System.out.println("Usage: java –jar FileCopy.jar <input file> <output file>");
         System.exit(1);
     }

      // open files
      Scanner in = new Scanner(new File(args[0]));
      PrintWriter out = new PrintWriter(new FileWriter(args[1]));

	   

		//create a hash table with the key being a string and the value being an int
		Hashtable<String, Integer> Bard = new Hashtable<String, Integer>();
				
		// pass the path to the file as a parameter 
	    File file = 
	      new File("shakespeare.txt"); 
	    Scanner sc = new Scanner(file); 
	    String line;
	  
	    while (sc.hasNextLine()) {
	    	//make line into a string
	    	 line = sc.nextLine();
	    	 //make lower case and replace all the punctuations with a space
	    	 line = line.toLowerCase().replaceAll("[,\\.\\!\\?\\:\\;\\[\\]]", " ");
	    	 String[] tokens = line.trim().split("\\s+") ;
	    	 
	    	 for(int i = 0; i < tokens.length; i ++) {
	    		 
	    		 //change the string into a Word with frequency of 1
	    		 int frequency = 1;
	    		 
	    		 
	    		 //if this word is already in the hashtable instead of adding it again we just increase its frequency
	    		 if( Bard.containsKey(tokens[i]) ) {
	    		 frequency = Bard.get(tokens[i]) +1;
	    		}
	    		 Bard.put(tokens[i],frequency);
	    		 
	    	 }
	    		 	
	    	}

	    	while( in.hasNextLine() ){

	    ArrayList<Word> list = new ArrayList<Word>();

	   String lane = in.nextLine();
	   String[] token = lane.trim().split("\\s+") ;
	   
	   //checks for empty line
	   if(lane.isEmpty()){
	   	System.out.println("Wrong input");
	   	continue;
	   }

	   String l = token[0];
	   	int length2find = Integer.parseInt(l);
	   	
	   	String r = token[1];
	   	int rank = Integer.parseInt(r);


	   	System.out.println( length2find + "  " + rank);
	 
	    // get keys() from Hashtable and iterate
	    Enumeration<String> enumeration =Bard.keys();
	    
	 // iterate using enumeration object
	    
    	int amount = 0;
        while(enumeration.hasMoreElements()) {
        	
        	
            String key = enumeration.nextElement();
            if(key.length()== length2find) {
            	amount++;
            	Word w = new Word(key,Bard.get(key));
            	list.add(w);
            	//w.display();
            	
            	
            }
            
           
        }
        
        
        
       
        Collections.sort(list);   // Sorts the array list
        Collections.sort(list, new Word());
        if(list.isEmpty() || (rank >= list.size()) ) {
        	
        	out.println("-");
        }
        else{
        out.println(list.get(rank).letters);
       list.get(rank).display() ;
   }
        
       //for(Word a: list)   // printing the sorted list of names
          // System.out.println(a.letters + " Frequency: " + a.frequency);
        System.out.println("there are: "+ amount + " words of length: " + length2find);
        System.out.println(list.size());
        
        
	    }

	    in.close();
	    out.close();
	   
	     
	    }
	    
	    
	
}
	
	
	
	
	
	
	

class Word implements Comparator<Word>, Comparable<Word>{
	String letters;
	int frequency = 0;
	//int alpha;

Word(){
	
}
 Word(String s, int f){
	 this.letters = s;
	 this.frequency = f;
	// this.alpha = alphabetize(s,0);
 }
 
 
 
 public void display() {
	 System.out.println("Word: "+ letters + "  Frequency: "+ frequency );
 }
 
 

@Override
public int compareTo(Word w) {
	return (this.letters).compareTo(w.letters);
	
}

@Override
public int compare(Word w1, Word w2) {
	return -(w1.frequency - w2.frequency);
}
	
	
	
}

