/* go use interface to implement polymorphism*/
package main

// Animal interface is a pointer to a set of undefined functions
// The pointer can point to any type implementing Animal interface
// which is implementing all of its functions
type Animal interface {
	Sleep()
	GetColor() string
	GetType() string
}

type Cat struct {
	color string
}

func (cat *Cat) Sleep() {

}

func (cat *Cat) GetColor() string {
	return cat.color
}

func (cat *Cat) GetType() string {
	return "cat"
}

type Dog struct {
	color string
}

func (dog *Dog) Sleep() {

}

func (dog *Dog) GetColor() string {
	return dog.color
}

func (dog *Dog) GetType() string {
	return "dog"
}

func showAnimal(animal Animal) {
	animal.Sleep()
}

func main() {
	// polymorphism
	var animal Animal
	animal = &Cat{"red"} // interface variable can point to any implemented type
	animal.Sleep()

	showAnimal(&Cat{"red"})
	showAnimal(&Dog{"yellow"})
}
