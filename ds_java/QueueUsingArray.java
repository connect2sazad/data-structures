package ds_java;

public class QueueUsingArray {

   // defining constants
   static final int QUEUE_SIZE = 10;

   // declaring array to act as a queue
   int arr[];

   // setting up the initial value of front and rear
   static int front = -1;
   static int rear = -1;

   // constructor to instantiate the queue
   QueueUsingArray() {

      this.arr = new int[ QueueUsingArray.QUEUE_SIZE ];

   }

   // get_front function to get the index of the first data inserted
   int get_front() {

      // returning the front value
      return QueueUsingArray.front;

   }

   // get_rear function to get the index of the last data inserted
   int get_rear() {

      // returning the rear value
      return QueueUsingArray.rear;

   }

   // enqueue function to append a data
   void enqueue( int val ) {

      // check if the queue is full
      if (QueueUsingArray.rear == (QueueUsingArray.QUEUE_SIZE - 1) ) {
         System.out.println("OVERFLOW");
         System.exit( 0 );
      }

      // increasing rear value to store new data
      QueueUsingArray.rear++;

      // storing the data to new rear index
      this.arr[ QueueUsingArray.rear ] = val;

      // change front if the val is the first data
      if (QueueUsingArray.front == -1)
         QueueUsingArray.front = 0;
   }

   // dequeue function to remove the last appended data
   int dequeue() {

      // variable to store the dequeued data
      int dequeued = 0;

      // check if the queue is empty
      if ( QueueUsingArray.front == -1 ) {
         System.out.println( "UNDERFLOW" );
         System.exit( 0 );
      } else
      dequeued = this.arr[ QueueUsingArray.front++ ];

      // returning the dequeued value to the calling function
      return dequeued;

   }

   // show function to display all the data inserted to
   // the queue
   void show() {

      // prompting the user for queue display
      System.out.print("Queue contains: ");

      // generating a loop through the queue using the
      // get_front() and get_rear() function declared above by creating an
      // object of QueueUsingArray class
      QueueUsingArray queue = new QueueUsingArray();
      for (int i = queue.get_front(); i <= queue.get_rear(); i++) {
         // printing each data in the queue
         System.out.print(this.arr[i] + ", ");
      }

   }

   // main function to demonstrate the function of above
   // declared queue functions
   public static void main(String[] args) {

      // creating an object of QueueUsingArray class
      QueueUsingArray queue = new QueueUsingArray();

      // enqueuing some data
      queue.enqueue(10);
      queue.enqueue(20);
      queue.enqueue(30);
      queue.enqueue(40);

      // dequeuing last inserted data
      System.out.println( queue.dequeue() );

      // showing all the data inserted
      queue.show();
      System.out.println();

      // printing the value of front
      System.out.println("front = " + queue.get_front());

      // printing the value of rear
      System.out.println("rear = " + queue.get_rear());

   }

}