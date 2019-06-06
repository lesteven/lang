package main

import (
    "fmt"
)

// interface
type Bar interface {
    Hello(word string) string
}

// struct that implements interface
type Baz struct {
    Num int
}
func (b Baz) Hello(word string) string {
    return "hello " + word
}

// function that takes Bar interface
func sayHello(bar Bar) {
    fmt.Println(bar.Hello("world"))
}

func main() {
    baz := Baz{10}
    sayHello(baz)
}
