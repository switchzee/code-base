package main

import (
	"fmt"
)

/* declare a variable
[...]:not keyword
(...):optional
*/
func main() {
	// 1.manual initialization: global/local
	// var [variable name] ([var type]) (= [value])
	var a int = 100
	fmt.Printf("a=%T\n", a)
	var b = 3.14
	fmt.Printf("b=%T\n", b)
	var c = true
	fmt.Printf("c=%T\n", c)
	var d = "string"
	fmt.Printf("d=%T\n", d)

	// 2.auto initialization: only local
	// [variable]:=[value]
	e := 100
	fmt.Printf("e=%T\n", e)

	f := true
	fmt.Printf("f=%T\n", f)

	g := "string"
	fmt.Printf("g=%T\n", g)

	// multiple declaration in singel line
	var x, y = 1, "str"
	fmt.Println("x=", x, "y=", y)

	var (
		h = 1
		i = "str"
	)

	j, k := 1, "str"

	fmt.Println("h", h, "i=", i, "j=", j, "k=", k)

}
