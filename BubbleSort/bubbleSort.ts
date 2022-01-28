let nums : number[] = [2,4,6,33,5,3,77,8,5,6,88,9,0];

function bubbleSort() : void {

    for(let lastSortedIndex = nums.length - 1; lastSortedIndex > 0; lastSortedIndex--){

        for(let index = 0; index < nums.length; index++){
            
            if(nums[index] > nums[index + 1]){
                nums[index] = nums[index] ^ nums[index + 1];
                nums[index + 1] = nums[index] ^ nums[index + 1];
                nums[index] = nums[index] ^ nums[index + 1];
            }
        }
    }

}

bubbleSort();
console.log(nums);
