package main

import "fmt"

/* base class interface */

// interface can point to every data type

func prints(arg interface{}) {
	// assertion: interfaces{}.(desired type)
	// judge and convert: if arg is desired type returns notation(ok) and variable(of the type converted from arg)
	val, ok := arg.(string)
	if ok {
		fmt.Println("args is string")
		fmt.Println(val)
	} else {
		fmt.Printf("args is %T\n", arg)
		fmt.Println(val)
	}
}

func main() {
	prints(100)
	prints("string")
	prints(map[string]string{"1": "2"})

	var obj interface{}
	obj = "string"
	print(obj)
}
