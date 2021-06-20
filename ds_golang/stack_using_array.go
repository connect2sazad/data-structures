// declaring the main package for go
package main

// including "fmt" for outputs and "os" for exit
import (
	"fmt"
	"os"
)

// setting up the initial value of top
var top int = -1

// defining constants for stack size
const size int = 10

// declaring array to act as a stack
var stack [size]int

// push function to append a data
func push(val int) {

	// check if the stack is full
	if top == size-1 {
		fmt.Println("OVERFLOW")
		os.Exit(3)
	} else {

		// increasing top value ad inserting data
		top++
		stack[top] = val
	}
}

// pop function to remove the last appended data
func pop() int {

	// variable to store the popped data
	var popped int

	// check if the stack is empty
	if top == -1 {
		fmt.Println("UNDERFLOW")
		os.Exit(3)
	} else {

		// getting the last inserted data and decreasing the value of top
		popped = stack[top]
		top--
	}

	// returning the popped value to the calling function
	return popped
}

// peep function to get the index of the last data inserted
func peep() int {

	// returning the top value
	return top
}

// peek function to display all the data inserted to
// the stack
func peek() {

	// prompting the user for stack display
	fmt.Print("Stack contains: ")

	// generating a loop through the stack using the
	// peep() function declared above
	for a := 0; a <= peep(); a++ {
		fmt.Print(stack[a], ", ")
	}
	fmt.Println()
}

// main function to demonstrate the function of above
// declared stack functions
func main() {

	// pushing some data
	push(10)
	push(20)
	push(30)
	push(40)

	// popping last inserted data
	fmt.Println(pop())

	// peeking all the data inserted
	peek()

	// printing the value of top
	fmt.Println("top = ", peep())
}
