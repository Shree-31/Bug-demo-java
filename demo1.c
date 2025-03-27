#include <stdio.h>
#include <stdlib.h>

void buggyFunction(int n) {
    int *arr = malloc(n * sizeof(int));  // Bug: Memory allocated but not freed
    
    for (int i = 0; i <= n; i++) {  // Bug: Accessing out of bounds (i <= n instead of i < n)
        arr[i] = i * 2;
    }

    printf("Array elements: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // Missing: free(arr); // Memory leak
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", num);  // Bug: Missing '&' before num (should be scanf("%d", &num))

    buggyFunction(num);

    return 0;
}
