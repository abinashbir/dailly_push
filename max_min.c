// max
// #include <stdio.h>

// int main(){

//     int max =0;

//     int arr[5]={56,24,37,94,5};

//     for(int i=0;i<5;i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }  
//     }
//     printf("The max element is %d", max);

// }

#include <stdio.h>

int main(){

    int min;

    int arr[5]={56,24,37,94,5};

    for(int i=0;i<5;i++){
        if(arr[i]<min){
            min=arr[i];
        }  
    }
    printf("The max element is %d", min);

}