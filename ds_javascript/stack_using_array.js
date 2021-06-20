// basic functions to print
function print( param ) { 
   document.body.innerHTML += param;
}
function println( param ) { 
   document.body.innerHTML += param+"<br>";
}

class Stack{

   // setting up the initial value of top
   top=-1;

   // declaring array to act as a stack
   stack = null;

   // varibale to store size
   size = null;

   // constructor to instantiate the stack and size
   constructor( st_size ) { 
      this.size = st_size;
      
      // creating a new array
      this.stack = new Array( this.size );
   }

   // push function to append a data
   push( val ){

      // check if the stack is full
      if( this.top == this.size-1 )
         println( "OVERFLOW" );
      else 
         // inserting the value to the stack array
         this.stack[ ++this.top ] = val;
   }

   // pop function to remove the last appended data
   pop(){

      // check if the stack is empty
      if( this.top == -1 )
         println( "UNDERFLOW" );
      else
         // removing last inserted data and returning it
         return this.stack[ this.top-- ]
   }

   // peep function to get the index of the last data inserted
   peep(){

      // returning the top value
      return this.top;
   }

   // peek function to display all the data inserted to
   // the stack
   peek(){

      // prompting the user for stack display
      print( "Stack contains: " );

      // generating a loop through the stack using the
      // peep() function declared above
      for ( let i = 0; i <= this.top; i++ )
         // printing each data in the stack
         print( this.stack[ i ]+", " );
      println( "" )
   }
}

// demonstrate the function of above
// declared stack functions

// creating an object of Stack class
let st = new Stack( 10 )

// pushing some data
st.push( 10 )
st.push( 20 )
st.push( 30 )
st.push( 40 )

// popping last inserted data
println( st.pop() )

// peeking all the data inserted
st.peek();

// printing the value of top
print( "top = " + st.peep() )