// include stdio.h file for outputs
#include<stdio.h>

// defining constants
#define STACK_SIZE 10

// declaring the array to act as a stack
int arr[ STACK_SIZE ];

// setting up ther initial value of top
int top = -1;

// push function to append a data
void push ( int val ) {

    // check if the stack is full
    if ( top == STACK_SIZE - 1 )
        printf( "OVERFLOW" );
    else
        arr[ ++top ] = val;

}

// pop function to remove the last appended data
int pop(){

    // variable to store the appended data
    int popped;

    // check if the stack is empty
    if( top == -1 )
        printf( "UNDERFLOW" );
    else
        popped = arr[ top-- ];

    // returning the popped value to the calling function
    return popped;

}

// peep function to get the index of the last data inserted
int peep(){

    // returning the top value
    return top;

}

// peek function to display all the data inserted to the stack
void peek(){

    // prompting the user for stack data display
    printf( "Stack contains: " );

    // generating a lopop through the stack using the peep() function declared above
    for ( int i = 0; i <= peep(); i++ ){
        
        // printing each data in the stack
        printf( "%d, ", arr[ i ] );

    }

}

// main function to demonstrate the function of above declared stack functions
void main(){

    // pushing some data
    push( 10 );
    push( 20 );
    push( 30 );
    push( 40 );

    // popping last inserted data
    printf( "Popped: %d\n",  pop() );

    // peeking all the data inserted
    peek();

    // printing the value of top
    printf( "\ntop: %d\n", peep() );

}
