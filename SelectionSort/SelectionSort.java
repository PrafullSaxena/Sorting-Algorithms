
import java.util.Arrays;

public class SortingAlgos {

    public static void main(String[] args) {

        int[] nums = {2,4,6,33,5,3,77,8,5,6,88,9,0};

        System.out.println("Before Sorting - ");
        Arrays.stream(nums).forEach(val -> System.out.print(" " + val));

        nums = selectionSort(nums);
      
        System.out.println("\nAfter Sorting - ");
        Arrays.stream(nums).forEach(val -> System.out.print(" " + val));

    }

    public static int[] selectionSort(int[] nums){

        for(int lastSortedIndex = nums.length - 1; lastSortedIndex > 0; lastSortedIndex-- ){
            int max = nums[0];
            for(int index = 1; index < lastSortedIndex; index++){
                if(nums[index] > max){
                    max = nums[index];
                }
            }
            nums[lastSortedIndex] = max ^ nums[lastSortedIndex];
            max = max ^ nums[lastSortedIndex];
            nums[lastSortedIndex] = max ^ nums[lastSortedIndex];
        }
        return nums;
    }
}
