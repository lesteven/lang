package main
import (
    "fmt"
)

// when in package, lowercase functions are not imported
// only uppercase functions are imported
func foo() string {
    return "hello world!" 
}
// () -> paramters var name first, then type
// return type comes after parameters
func bar(num int) int {
    return num * 2
}

func main() {
    fmt.Println(foo())
    fmt.Println(bar(5))
}
