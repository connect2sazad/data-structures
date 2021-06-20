# yet some errors to fix
# come back here later















# importing numpy for using numpy as array
# as there is no predefined array available in python,
#  we are using numpy library
import numpy as np
# you need to install numpy by typing the command
#  in terminal: 'pip3 install numpy' if you use python v3

class QueueUsingNumpy:

    # setting up the initial value of front and rear
    front, rear = -1, -1

    # instantiating the numpy array for queue
    queue = np.array( [], dtype='i4' )

    # defining the size of queue
    size = 10

    # enqueue function to append a data
    def enqueue( self, val ):

        # check if queue is full
        if self.rear == self.size-1:
            print( "OVERFLOW" )
            exit()
        else:

            # inserting the data to queue
            self.queue = np.append( self.queue, ( val ) )

            # increasing the value of rear
            self.rear += 1

            # check if front is -1
            if self.front == -1:
                self.front = 0
    
    # dequeue function to remove the first appended data
    def dequeue( self ):

        # variable to store the dequeued data
        dequeued = None
        
        # check if the queue is empty
        if self.rear == 1:
            print( "UNDERFLOW" )
            exit()
        else:
            dequeued = self.queue[ self.front ]
            self.queue = np.delete( self.queue, self.front )

            # increasing the value of top
            self.front += 1
        
        # returning the dequeued value
        return dequeued

    # get_front function to get the index of the first data inserted
    def get_front( self ):

        # returning the front value
        return self.front

    # get_rear function to get the index of the last data inserted
    def get_rear( self ):

        # returning the rear value
        return self.rear


    # show function to display all the data inserted to 
    # the queue
    def show( self ):
        
        # prompting the user for queue display
        print( "Queue contains: ", end="" )

        # generating a loop through the queue using the 
        # get_front() and get_rear() function declared above
        # print(self.get_front())
        for x in range( self.get_front(), ( self.get_rear() ) ):
            print(str(self.queue[ x ]), end=", ")
        print()

# demonstrate the function of above declared queue functions
if __name__ == "__main__":

    # creating an object of QueueUsingNumpy class
    st = QueueUsingNumpy()

    # enqueueing some data
    st.enqueue( 10 )
    st.enqueue( 20 )
    st.enqueue( 30 )
    st.enqueue( 40 )

    # dequeueing the last inserted data
    print( st.dequeue() )

    # showing all the data inserted
    st.show()

    # printing the value of front
    print( "front = ", str( st.get_front() ) )
    
    # printing the value of rear
    print( "rear = ", str( st.get_rear() ) )
