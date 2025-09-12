#include <stdio.h>
int main() {
    int x = 10;
    int *p;      
    p = &x;      

    printf("Value of x = %d\n", x);
    printf("Address of x = %p\n", p);
    printf("Value via pointer = %d\n", *p); 
    return 0;
}
