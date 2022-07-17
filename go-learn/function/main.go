package main

import "fmt"

// func [function name]([variable name][type]...) ([variable name][type]...){...}
// note that multiple return value
// 1. unnamed return variable
func nextFib(pre int, cur int) (int, int) {
	return cur, pre + cur
}
func nextFib1(pre, cur int) (int, int) {
	return cur, pre + cur
}

// 2. named return variable: as local variable
func nextFib2(pre int, cur int) (r1 int, r2 int) {
	// now r1,r2 is 0(default local variable)
	r1 = cur
	r2 = pre
	return
}
func nextFib3(pre int, cur int) (r1, r2 int) {
	r1 = cur
	r2 = pre
	return
}
func main() {
	fmt.Println(nextFib(1, 2))
}
