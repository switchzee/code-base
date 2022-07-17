package main

import "fmt"

func printMap(dict map[string]string) {
	for key, val := range dict {
		fmt.Println(key, val)
	}
}
func main() {
	/* declaration map[key type]value type(reference) */
	var emptyMap map[string]string // 1. declare empty map
	if emptyMap == nil {
		fmt.Println("empty map is null")
	}
	emptyMap = make(map[string]string, 10) // allocate map space with cap 10,
	// so when it exceeds its cap, go will allocate new cap = 2*cap
	myMap := make(map[string]string, 10) // 2. declare + define
	initMap := map[string]string{        // 3. declare + define + initialization
		"1": "2",
		"2": "2",
	}
	emptyMap["1"] = "2"
	emptyMap["2"] = "2"
	fmt.Println(emptyMap)
	fmt.Println(myMap)
	fmt.Println(initMap)
	// iteration
	for key, val := range initMap {
		fmt.Println(key, val)
	}
	// deletion
	delete(initMap, "1")

	// addition
	initMap["3"] = "4"
	printMap(initMap)
}
