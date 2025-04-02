#include <stdio.h>
#include <stdlib.h>

void buggyFunction(int n) {
    int *arr = malloc(n * sizeof(int));  
    
    for (int i = 0; i <= n; i++) {  
        arr[i] = i * 2;
    }

    printf("Array elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", num);  

    buggyFunction(num);

    return 0;
}
