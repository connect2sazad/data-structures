// include stdio.h file for outputs
#include<stdio.h>

// defining constants
#define QUEUE_SIZE 10

// declaring the array to act as a queue
int arr[ QUEUE_SIZE ];

// setting up ther initial value of front and rear
int front = -1, rear = -1;

// enqueue function to append a data
void enqueue( int val ){

    // check if the queue is full
    if( rear == QUEUE_SIZE-1 )
        printf( "OVERFLOW" );
    else
        arr[ ++rear ] = val;
    
    if( front == -1 )
        front = 0;

}

// dequeue function to remove the first appended data
int dequeue(){

    // variable to store the first appended data
    int deleted;

    // check if the queue is empty
    if( front == -1 )
        printf( "UNDERFLOW" );
    else
        deleted = arr[ front++ ];

    // returning the deleted value to the calling function
    return deleted;

}

// get_front function to get the index of the first data inserted
int get_front(){

    // returning the front value
    return front;

}

// get_front function to get the index of the last data inserted
int get_rear(){
    
    // returning the rear value
    return rear;

}

// show function to display all the data inserted to the queue
void show(){

    // prompting the user for queue data display
    printf( "Queue contains: " );

    // generating a loop through the queue using the peep() function declared above
    for ( int i = get_front(); i <= get_rear(); i++ ){
        
        // printing each data in the queue
        printf( "%d, ", arr[ i ] );

    }

}

// main function to demonstrate the function of above declared stack functions
void main(){

    // enqueuing some data
    enqueue( 10 );
    enqueue( 20 );
    enqueue( 30 );
    enqueue( 40 );

    // dequeuing first inserted data
    printf( "Deleted: %d\n",  dequeue() );

    // showing all the data inserted
    show();

    // printing the value of front
    printf( "\nfront: %d", get_front() );

    // printing the value of rear
    printf( "\nrear: %d", get_rear() );

}