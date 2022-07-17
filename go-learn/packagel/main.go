package main

import (
	"packagel/libs"

	// alias import
	. "fmt"     // (not recommanded )alias as . so that use function without package name.
	m "math"    // use alias m to call package math
	_ "strings" // anoymous alias calls its init() but not its function

	// remote import, binarys will be downloaded and putting into $GOBIN
	r "github.com/google/go-cmp/cmp"
)

/*
import->(
	import->(
		...
	)->const->var->init
)->const->var->init->main
*/
func main() {
	libs.Hi()
	Println("hello go")
	Println(m.Abs(-1))
	Println(r.Diff("hello", " hello go"))
	// main import->
	// lib1 import->lib1 init->
	// lib2 import->lib2 init->
	// main init-> main
}
