package main

import "fmt"

type Human struct {
	name string
	sex  string
}

func (human *Human) walk() {
	fmt.Println("Human walk")
}

func (human *Human) eat() {
	fmt.Println("Human eat")
}

type SuperMan struct {
	Human // subclass SuperMan inheritance from Human

	level int
}

// overwritten
func (superMan *SuperMan) eat() {
	fmt.Println("SuperMan eat")
}

// new member function
func (superMan *SuperMan) fly() {
	fmt.Println("SuperMan fly")
}

func main() {
	// inheritance
	human := Human{"jack", "male"}
	human.eat()
	human.walk()

	// define a subclass
	superMan := SuperMan{human, 10}
	superMan.eat()
	superMan.walk()
	superMan.fly()
}
