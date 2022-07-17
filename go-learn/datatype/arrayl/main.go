package main

import "fmt"

// value
func printArray(arr [4]int) {
	for _, val := range arr {
		fmt.Print(val, " ")
	}
	fmt.Println()
}

// pointer
func printSlice(arr []int) {
	for _, val := range arr {
		fmt.Print(val, " ")
	}
	fmt.Println()
}

func main() {
	/*1. static array*/
	// define an array(as a pointer)
	// var [array name] [size] [element type]
	var myArray [10]int

	myArray1 := [4]int{1, 2, 3, 4}
	myArray2 := [3]int{1, 2, 3}

	// iteration
	for i := 0; i < len(myArray); i++ {
		fmt.Printf(" %d", myArray[i])
	}
	fmt.Println()
	for index, value := range myArray {
		fmt.Println("index=", index, "value=", value)
	}

	// check type of array
	// different data type for different length array
	fmt.Printf("array type is: %T\n", myArray)
	fmt.Printf("array type is: %T\n", myArray1)
	fmt.Printf("array type is: %T\n", myArray2)
	// print array
	//printArray(myArray2); wrong, myArray1 is not [4]int
	printArray(myArray1) // correct

	// create 2d array, dim must be constant
	my2dArray := [5][5]int{}
	fmt.Println(my2dArray)

	/*2. slice: dynamic array*/
	var emptySlice []int // slice with no space
	initSlice := []int{1, 2, 3, 4}
	// make(type, length, capacity)
	emptySlice = make([]int, 3, 5) // allocate space to slice
	slice := make([]int, 4, 5)     // define a slice and allocate space to it
	printSlice(initSlice)
	printSlice(emptySlice)
	printSlice(slice)
	// check slice is not null
	if slice != nil {
		printSlice(slice)
	}
	// operation: append, if slice exceeds cap, allocate new cap = 2*cap
	fmt.Printf("length = %d, cap = %d\n", len(slice), cap(slice))
	slice = append(slice, 0, 0, 0)
	fmt.Printf("length = %d, cap = %d\n", len(slice), cap(slice))
	// operation: slicing[start: end] which is [start, end-1]
	sliceSlice := slice[0:3]
	fmt.Println("before")
	printSlice(sliceSlice)
	printSlice(slice)
	sliceSlice[0] = 1 // slice and origin points to the same data area
	fmt.Println("after")
	printSlice(sliceSlice)
	printSlice(slice)
	sliceSlice = make([]int, 3)
	fmt.Println("before")
	copy(sliceSlice, slice) // deep copy
	printSlice(sliceSlice)
	printSlice(slice)
	sliceSlice[1] = 1
	fmt.Println("after")
	printSlice(sliceSlice)
	printSlice(slice)
}
