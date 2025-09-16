#include <stdio.h>

void greet() {
    printf("function pointers\n");
}
int main() {
    void (*funcPtr)() = greet; 
    funcPtr(); 
    return 0;
}
