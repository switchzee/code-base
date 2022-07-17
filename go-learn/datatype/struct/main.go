package main

import "fmt"

// type [struct name] struct {...}
// a self defined type
type Integer int

type Book struct {
	/* attribute capitalized means public to package not is private to package */
	// private
	title string
	auth  string
	// public
	Date string
}

/* member function: function bounded to a certain parameter type*/
// bond to a Book type parameter named book(value copy receiver)
func (book Book) getTitle() string {
	return book.title
}

// bond to a Book type reference parameter named book(reference receiver)
func (book *Book) setTitle(title string) {
	book.title = title
}

// public member function
func (book Book) Print() {
	fmt.Printf("book %s was written by %s\n", book.getTitle(), book.auth)
}

/* common function*/
// value
func getTitle(book Book) string {
	return book.title
}

// pointer
func changeTitle(book *Book, title string) {
	book.title = title
}

func main() {
	var integer Integer
	fmt.Printf("type of integer is %T\n", integer)

	var book Book
	book.title = "1984"
	book.auth = "George"

	book.Print()
	changeTitle(&book, "adventure time")
	book.Print()
	book.setTitle("harry potter")
	book.Print()
}
