//odd
// #include <stdio.h>

// int main(){

//     int odd =0;

//     int arr[5]={56,24,37,94,5};

//     for(int i;i<5;i++){
//         if(i%2!=0){
//             odd+=1;
//         }
//     }

//     printf("Total odds are %d", odd);

// }

#include <stdio.h>

int main(){

    int even =0;

    int arr[5]={56,24,37,94,5};

    for(int i;i<5;i++){
        if(i%2==0){
            even+=1;
        }
    }

    printf("Total odds are %d", even);

}