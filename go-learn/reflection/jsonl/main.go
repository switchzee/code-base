package main

import (
	"encoding/json"
	"fmt"
)

/* json use struct tag as the key */
type Movie struct {
	Title  string   `json:"title"`
	Year   int      `json:"year"`
	Price  int      `json:"rmb"`
	Actors []string `json:"actors"`
}

func main() {
	movie := Movie{"god father", 2008, 10, []string{"tom", "bob"}}
	// convert object into json
	jsonStr, err := json.Marshal(movie) // returns json encoding of an object and error notation
	if err != nil {
		fmt.Println("conversion error: ", err)
	} else {
		fmt.Printf("convert into json string: %s\n", jsonStr)
	}
	// convert json string into object
	anotherMovie := Movie{}
	err = json.Unmarshal(jsonStr, &anotherMovie)
	if err != nil {
		fmt.Println("conversion error: ", err)
	} else {
		fmt.Println(anotherMovie)
	}
}
