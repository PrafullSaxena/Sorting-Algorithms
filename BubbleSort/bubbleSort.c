#include<stdio.h>

int main(){

    int nums[13] = {2,4,6,33,5,3,77,8,5,6,88,9,0};

    for(int lastSortedIndex = 12; lastSortedIndex > 0; lastSortedIndex--){
        for(int index = 0; index < lastSortedIndex; index++){
            if( nums[index] > nums[index + 1]){
                nums[index] = nums[index] ^ nums[index + 1];
                nums[index + 1] = nums[index] ^ nums[index + 1];
                nums[index] = nums[index] ^ nums[index + 1];
            }
        }
    }

    for(int index = 0; index < 13; index++){
        printf(" %i", nums[index]);
    }
    
    return 0;
}
