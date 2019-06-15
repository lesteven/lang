#include <stdio.h>

// gcc -std=c89 -pedantic <file>
// makes all declarations come before statements (code)
// declaration -> identifier and type
// definition -> implements identifier
// statements -> are expressions (eg. function calls, etc)

int main() {
    int foo = 10;
    printf("%d\n", foo); 

    int bar = 50;
    printf("%d\n", bar); 
}
