#include <stdio.h>

int main(){

    int arr[9]={1,2,2,3,3,3,3,4,5};
    int number;
    int frequency=0;

    printf("Enter the element : ");
    scanf("%d", &number);

    for(int i=0;i<9;i++){
        if(arr[i]==number){
            frequency+=1;
        }
    }

    printf("The frequency of the element  is %d",frequency);

}