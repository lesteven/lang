
package main

import "fmt"

type Pet struct {
    Name string
    Type string
}

type Person struct {
    Name string
    Age int
    Pet *Pet
}

// to modify fields within struct, must use pointer receiver
func (p *Person) increaseAge() {
    p.Age++
}

func (P Person) sayHello() {
    fmt.Println("Hello there!")
}

func main() {
    // regualar struct
    foo := Person{"Keanu Reeves",50, &Pet{"grouch", "cat"}}
    fmt.Println("regular struct: ", foo)
    fmt.Println()

    // pointer to struct
    // automatically deference when accessing field
    bar := &foo
    fmt.Println("pointer to struct: ", bar)
    fmt.Println("automatic dereference: ", bar.Name)
    fmt.Println()

    // pointer to Pet within Person
    // AD (automatic dereference)
    fmt.Println("AD pointer within struct: ", foo.Pet.Name)
    fmt.Println()

    fmt.Println(bar.Pet.Name)

    // apply method, automatically takes address of variable
    // automatic &foo on person struct
    foo.increaseAge()
    fmt.Println(foo)

    // cant call pointer receiver method on struct literal
    // but could on regular methods
    //Person{"Steven", 100, &Pet{"lucky","dog"}}.increaseAge()
    Person{"Steven", 100, &Pet{"lucky","dog"}}.sayHello()
}










