#ifndef _QUEUE_H_INCLUDE_
#define _QUEUE_H_INCLUDE_
 
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Node {
  int value;
  struct Node *next;
} node;

typedef struct Queue {
  node *head;
  node *tail;
} queue;

// Creates new queue
queue * create_queue();

// Adds value at end of available storage
void enqueue(queue *q, int value);

// Returns value of least recently added element and removes it
 int dequeue(FILE* out, queue *q);

// Returns true if queue is empty
bool empty(queue *q);


// Free up memory used by queue
void destroy_queue(queue *q);

//print the contents of the queue
void print_queue(FILE* out ,queue *q);


#endif // End of queue header