#include "queue.h"


queue * create_queue() {
  queue *q = malloc(sizeof(node));

  q->head = NULL;
  q->tail = NULL;

  return q;
}

void enqueue( queue *q, int value) {
  node *new_node = malloc(sizeof(node));
  

  new_node->value = value;
  new_node->next = NULL;

  if (q->tail) {
    q->tail->next = new_node;
  }
  q->tail = new_node;

  if (q->head == NULL) {
    q->head = new_node;
  }

  
}

int dequeue(FILE* out, queue *q) {

  if (empty(q)) {
    fprintf(out,"empty\n");
    return 0;
  }

  int value = q->head->value;

  node *temp = q->head;

  if (q->tail == q->head) {
    q->tail = NULL;
  }

  q->head = q->head->next;
  free(temp);

  fprintf(out,"%d\n", value);

  return value;
}

//see if queue is empty
bool empty(queue *q) {
  return q->head == NULL;
}

void destroy_queue(queue *q) {

  node *current = q->head;
  node *temp = q->head;

  while (current) {
    temp = current;
    current = current->next;
    free(temp);
  }

  free(q);
}

void print_queue(FILE* out, queue *q){
   if( q==NULL ){
      fprintf(stderr, 
              " Error: print_queue() called on NULL queue reference\n");
      exit(EXIT_FAILURE);
   }

    if (empty(q)) {
    fprintf(out,"\n");
  
  }


  node *current = q->head;
  

while (current!= NULL) {
	if(current-> value == q->tail->value){
fprintf(out, "%d\n", current->value);
	}
	else{
    fprintf(out, "%d ", current->value);
}
    current = current->next;
   
  }
}





