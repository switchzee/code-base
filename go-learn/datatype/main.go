package main

import "fmt"

func main() {
	// static type
	var str string
	str = "this"
	// str is pair<type:string, value:"this">
	//str = 123 wrong, static type can not be changed
	fmt.Printf("type of str is %T\n", str)

	// dynamic type
	var obj interface{}
	// str is pair<type, value>
	obj = "this"
	// str is pair<type:string, value:"this">
	fmt.Printf("type of obj is %T\n", obj)
	obj = 123 // dynamic type can be changed during runtime
	// str is pair<type:int, value:123>
	fmt.Printf("type of obj is %T\n", obj)
}
