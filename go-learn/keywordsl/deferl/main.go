package main

import "fmt"

func same(s string) int {
	fmt.Println(s)
	return 0
}
func deferReturn() int {
	// defer is executed after return
	defer fmt.Println(("defer executed"))
	return same("return executed")
}

func main() {
	// defer + expression: put expression in stack
	// pop and execute after current function ends(after return)

	defer fmt.Println("defer-stack end")
	defer fmt.Println("defer-stack head")
	fmt.Println("main: hello go1")
	fmt.Println("main: hello go2")
	deferReturn()
}
