package ds_java;

public class StackUsingArray {

    // defining constants
    static final int STACK_SIZE = 10;
 
    // declaring array to act as a stack
    int arr[];
 
    // setting up the initial value of top
    static int top = -1;
 
    // constructor to instantiate the stack
    StackUsingArray() {
       this.arr = new int[ StackUsingArray.STACK_SIZE ];
    }
 
    // peep function to get the index of the last data inserted
    int peep() {

       // returning the top value
       return StackUsingArray.top;

    }
 
    // push function to append a data
    void push( int val ) {
 
       // check if the stack is full
       if ( StackUsingArray.top == StackUsingArray.STACK_SIZE - 1 ) {
          System.out.println( "OVERFLOW" );
          System.exit( 0 );
       }

       // increasing top value to store new data
       StackUsingArray.top++; 

       // storing the data to new top index
       this.arr[ StackUsingArray.top ] = val;
    }
 
    // pop function to remove the last appended data
    int pop() {
 
       // variable to store the popped data
       int popped = 0;
 
       // check if the stack is empty
       if ( StackUsingArray.top == -1 ) {
          System.out.println( "UNDERFLOW" );
          System.exit( 0 );
       } else
          popped = this.arr[ StackUsingArray.top-- ];
 
       // returning the popped value to the calling function
       return popped;

    }
 
    // peek function to display all the data inserted to
    // the stack
    void peek() {

       // prompting the user for stack display
       System.out.print( "StackUsingArray contains: " );
 
       // generating a loop through the stack using the
       // peep() function declared above by creating an
       // object of StackUsingArray class
       StackUsingArray stack = new StackUsingArray();
       for ( int i = 0; i <= stack.peep(); i++ ) {
          // printing each data in the stack
          System.out.print( this.arr[i] + ", " );
       }

    }
 
    // main function to demonstrate the function of above
    // declared stack functions
    public static void main(String[] args) {

       // creating an object of StackUsingArray class
       StackUsingArray stack = new StackUsingArray();
 
       // pushing some data
       stack.push( 10 );
       stack.push( 20 );
       stack.push( 30 );
       stack.push( 40 );
 
       // popping last inserted data
       System.out.println( stack.pop() );
 
       // peeking all the data inserted
       stack.peek();
       System.out.println();
 
       // printing the value of top
       System.out.println( "top = " + stack.peep() );

    }

 }