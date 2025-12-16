#include <stdio.h>


int main(){

    int arr[5]={1,2,3,4,5};
    int totalSum=0;

    for(int i=0;i<5;i++){
        totalSum+=arr[i];
    }

    printf("The sum of the array is %d",totalSum);

}