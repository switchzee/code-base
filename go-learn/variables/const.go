package main

import "fmt"

/* constant declaration */

// 1. const enumeration
const (
	FIRST  = 0
	SECOND = 1
)

// use iota, automatic increase 1 from 0 line by line
const (
	BEIJING  = iota // itoa = 0
	SHANGHAI        // itoa = 1
)

func main() {
	const length int = 100
	// length = 1  error

	fmt.Println("FIRST=", FIRST)
	fmt.Println("SECOND=", SECOND)
	fmt.Println("BEIJING=", BEIJING)
	fmt.Println("SHANGHAI=", SHANGHAI)
}
