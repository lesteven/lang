#include <stdio.h>

int main() {

    // for loop increments after body executes, assuming it passes
    // the conditional first
    for (int i = 0; i < 10; i++) {
        printf("hey\t");
        printf("%d\n", i);
    }
    // doesnt run
    for (int i = 0; i < 0; i++) {
        printf("bye\t");
        printf("%d\n", i);
    }
}
