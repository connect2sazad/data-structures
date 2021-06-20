# importing numpy for using numpy as array
# as there is no predefined array available in python,
#  we are using numpy library
import numpy as np
# you need to install numpy by typing the command
#  in terminal: 'pip3 install numpy' if you use python v3

class StackUsingNumpy:

    # setting up the initial value of top
    top = -1

    # instantiating the numpy array for stack
    stack = np.array( [], dtype='i4' )

    # defining the size of stack
    size = 10

    # push function to append a data
    def push( self, val ):

        # check if stack is full
        if self.top == self.size-1:
            print( "OVERFLOW" )
            exit()
        else:

            # inserting the data to stack
            self.stack = np.append( self.stack, ( val ) )

            # increasing the value of top
            self.top += 1
    
    # pop function to remove the last appended data
    def pop( self ):

        # variable to store the popped data
        popped = None
        
        # check if the stack is empty
        if self.top == 1:
            print( "UNDERFLOW" )
            exit()
        else:
            popped = self.stack[ self.top ]
            self.stack = np.delete( self.stack, self.top )

            # decreasing the value of top
            self.top -= 1
        
        # returning the popped value
        return popped

    # peep function to get the index of the last data inserted
    def peep( self ):

        # returning the top value
        return self.top

    # peek function to display all the data inserted to 
    # the stack
    def peek( self ):
        
        # prompting the user for stack display
        print( "Stack contains: ", end="" )

        # generating a loop through the stack using the 
        # peep() function declared above
        for x in range(self.peep()+1):
            print(str(self.stack[ x ]), end=", ")
        print()

# demonstrate the function of abo0ve declared stack functions
if __name__ == "__main__":

    # creating an object of StackUsingNumpy class
    st = StackUsingNumpy()

    # pushing some data
    st.push( 10 )
    st.push( 20 )
    st.push( 30 )
    st.push( 40 )

    # popping the last inserted data
    print( st.pop() )

    # peeking all the data inserted
    st.peek()

    # printing the value of top
    print( "top = ", str( st.peep() ) )
