<?php      

    class Stack{
        
        # setting up the initial value of top
        public $top = -1;

        # declaring the array for stack
        public $stack = array();
        
        // constructor to instantiate the stack and size
        function __construct( $st_size ){

            # defining the size of stack
            $this->size = $st_size;

        }

        # push function to append a data
        function push( $val ){

            # check if stack is full
            if( $this->top == ($this->size - 1) )
                die( "OVERFLOW" );
            # inserting the data to stack and increasing the value of top
            else
                $this->stack[ ++$this->top ] = $val;

        }

        # pop function to remove the last appended data
        function pop(){

            # variable to store the popped data
            $popped = null;

            # check if the stack is empty
            if( $this->top == -1 )
                die( "UNDERFLOW" );
            # decreasing the value of top
            else
                $popped = $this->stack[ $this->top-- ];

            # returning the popped value
            return $popped;

        }

        # peep function to get the index of the last data inserted
        function peep(){

            # returning the top value
            return $this->top;

        }

        # peek function to display all the data inserted to 
        # the stack
        function peek(){

            # prompting the user for stack display
            echo "Stack contains: ";

            # generating a loop through the stack using the 
            # peep() function declared above
            for ($i=0; $i <= $this->top; $i++) { 
                
                echo $this->stack[ $i ] . ", " ;

            }
            echo "<br>";
        }

    }

    # demonstrate the function of abo0ve declared stack functions
    # creating an object of Stack class
    $stacked = new Stack(10);

    # pushing some data
    $stacked->push(10);
    $stacked->push(20);
    $stacked->push(30);
    $stacked->push(40);

    # popping the last inserted data
    echo "Popped: " . $stacked->pop() . "<br>";
    
    # peeking all the data inserted
    $stacked->peek();

     # printing the value of top
    echo "Top: " . $stacked->peep();


?>