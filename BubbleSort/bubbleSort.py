nums = [2,4,6,33,5,3,77,8,5,6,88,9,0];

def bubbleSort():
    revRange = reversed(range(0, len(nums)))
    for lastSortedIndex in revRange:
        for index in range(0, lastSortedIndex):
            if(nums[index] > nums[index + 1]) :
                nums[index], nums[index + 1] = nums[index + 1], nums[index]

bubbleSort();
print(nums);
