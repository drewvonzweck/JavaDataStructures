#include <stdlib.h>
#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>
#include<string.h>
#include "queue.h"
#include "queue.c"


int main(int argc, char *argv[]) {

   FILE* in;  /* file handle for input */  
   FILE* out; /* file handle for output */
   char line[256]; /* char array to store words from input file */

	/* check command line for correct number of arguments */
   if( argc != 3 ){
      printf("Usage: %s <input file> <output file>\n", argv[0]);
      exit(EXIT_FAILURE);
   }

   /* open input file for reading */
   in = fopen(argv[1], "r");
   if( in==NULL ){
      printf("Unable to read from file %s\n", argv[1]);
      exit(EXIT_FAILURE);
   }

   /* open output file for writing */
   out = fopen(argv[2], "w");
   if( out==NULL ){
      printf("Unable to write to file %s\n", argv[2]);
      exit(EXIT_FAILURE);
   }

   //create the QUEUE
	queue* q = create_queue();

   //looks at input line by line
    while( fgets(line, sizeof(line), in) != NULL ){
     
     size_t len = strlen(line); 

     if(len > 2){
    	//tokenize the string by whitespace
    	int i = 0;
   		char *p = strtok (line, " ");
    	char *array[2];

    	//fill char array with the characters tokenized from the line
    	while (p != NULL) {
        array[i] = p;
        i++;
        p = strtok (NULL, " ");
     }

    int val = atoi(array[1]);
    enqueue( q, val);
    fprintf(out,"enqueued %d\n", val);
    



}

	else{
	char command = line[0];
	

//checks to see if the character is an 'p' meaning print
	if(command == 'p'){
    		print_queue(out,q);
				}

//checks to see if the character is an 'p' meaning print
	if(command == 'd'){
    	 dequeue(out,q);
    		
				}
} 
    
    	
    }

    destroy_queue(q);

}
