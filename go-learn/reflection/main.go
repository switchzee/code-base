package main

import (
	"fmt"
	"reflect"
)

/* use reflection to get type from a variable*/
// every variable a pair of type and value

func reflectBasic(obj interface{}) {
	fmt.Println("type = ", reflect.TypeOf(obj))
}

type User struct {
	Id int `info:"identity" type:"integer"`
	// struct tag <key:value>, can be obtained by reflection,
	// show more information about an attribute
	Name string `info:"user name" type:"string"`
	Age  int    `info:"user age" type:"integer"`
}

func (user User) Call() {
	fmt.Println("user is called")
}

func reflectComplex(obj interface{}) {
	// get type
	objType := reflect.TypeOf(obj)
	fmt.Println("type = ", objType)

	// get value
	objValue := reflect.ValueOf(obj)
	fmt.Println("value is ", objValue)

	// get fields
	fmt.Println("fields are:")
	for i := 0; i < objType.NumField(); i++ {
		field := objType.Field(i)
		value := objValue.Field(i)
		fmt.Println(field.Name, field.Type, value)
	}

	// get member function
	fmt.Println("methods are:")
	for i := 0; i < objType.NumMethod(); i++ {
		method := objType.Method(i)
		// calling value of obj value
		caller := objValue.Method(i)
		fmt.Println(method.Name, method.Type)
		caller.Call(nil)
	}
}

func main() {
	var num = 1.2345
	reflectBasic(num)

	var obj interface{}
	obj = "123"
	reflectBasic(obj)

	user := User{123, "Alice", 20}
	reflectComplex(user)

	//get user tag
	t := reflect.TypeOf(user)
	for i := 0; i < t.NumField(); i++ {
		infoTag := t.Field(i).Tag.Get("info")
		typeTag := t.Field(i).Tag.Get("type")
		fmt.Println("info: ", infoTag, ", type: ", typeTag)
	}
}
