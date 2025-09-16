// pointer to pointer
#include <stdio.h>
int main() {
    int num = 5;
    int *ptr = &num;   
    int **pptr = &ptr; 

    printf("Value: %d\n", **pptr); 
    return 0;
}
