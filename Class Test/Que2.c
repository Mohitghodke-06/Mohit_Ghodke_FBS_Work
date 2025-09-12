//write a program to reverse a given number of any digit using recursive function.

#include <stdio.h>
int reverseNumber(int n,int rev) {
    if (n==0)
        return rev;
    rev = rev*10+(n%10);
    return reverseNumber(n/10,rev);
}

int main() {
    int num, reversed;
    printf("Enter a number: ");
    scanf("%d",&num);

    reversed = reverseNumber(num,0);

    printf("The Rserved number is: %d\n", reversed);

    return 0;
}
